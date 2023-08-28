package com.mruruc.stream.exercise;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseV3 {
    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction(50, LocalDate.of(2023, 1, 5)),
                new Transaction(150,LocalDate.of(2023, 2, 10)),
                new Transaction(30, LocalDate.of(2023, 1, 3)),
                new Transaction(200, LocalDate.of(2023, 1, 20))
        );

        /**
         * filter out transactions that are more than $100, then sort them by date,
         * and finally, collect them into a list. Now, while doing this,
         * you also want to check the transactions after filtering but before sorting,
         * just to ensure that the filtering worked as expected.
         */

      /*  List<Transaction> transactions2=transactions.stream().filter(t-> t.amount() > 100)
                             .peek(t-> System.out.println("Transaction Before Sorting: "+t))
                             .sorted((t1,t2)-> t1.date().compareTo(t2.date())).toList();
        transactions2.forEach(System.out::println); */

        List<Transaction> filteredSortedTransactions = transactions.stream()
                .filter(t -> t.amount() > 100)
                .peek(t -> System.out.println("After filtering: " + t)) // For debugging
                .sorted(Comparator.comparing(Transaction::date))
                .peek(t -> System.out.println("After sorting: " + t)) // For debugging
                .collect(Collectors.toList());



    }
}

record Transaction(double amount, LocalDate date) {
}
