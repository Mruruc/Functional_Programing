package com.mruruc.stream.exercise;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class ExerciseV5 {
    public static void main(String[] args) {

        /**
         * he methods summingInt(mapper), summingLong(mapper), and summingDouble(mapper) are part of Java's Stream API,
         * specifically as static methods within the Collectors class.
         * They are used to sum the elements of a stream after transforming them using the provided mapper function.
         */
        List<Person> people =
                Arrays.asList(new Person("Alice", 25),
                        new Person("Bob", 30),
                        new Person("Charlie", 35));

        Integer sumOfAge = people.stream().collect(Collectors.summingInt(person -> person.age()));
        System.out.println("Average of Ages:" + sumOfAge / people.size());


        List<TransactionV2> transactions =
                Arrays.asList(new TransactionV2(1000L),
                        new TransactionV2(500L),
                        new TransactionV2(1500L));

        Long sumOfTrans= transactions.stream().collect(Collectors.summingLong(t -> t.amount()));
        System.out.println(sumOfTrans);

        /**
         * averagingInt(mapper), averagingLong(mapper), and averagingDouble(mapper):
         *
         * Calculates the average of stream elements after mapping them.
         */

        Double collect = transactions.stream()
                        .collect(Collectors.averagingDouble(t -> t.amount()));
        System.out.println(collect);
    }
}
record TransactionV2(long amount){}

record Person(String name,int age){}
