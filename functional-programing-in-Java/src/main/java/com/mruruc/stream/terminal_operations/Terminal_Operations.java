package com.mruruc.stream.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntSupplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Terminal_Operations {

    public static void main(String[] args) {

        /**
         * forEach(Consumer<T>):
         *
         * Purpose: It is used to iterate over each element of the stream.
         * Parameters: A Consumer<T> which represents an action to be performed on each element of the stream.
         */

        Stream.of("John","Jane","Bob").forEach(s -> System.out.print(s+" "));
        System.out.println();
        /**
         * toArray():
         *
         * Purpose: Converts the stream into an array.
         * Returns: An array containing the elements of the stream.
         */

        int[] ints = IntStream.generate(() -> (int) (Math.random() * 10))
                .limit(6).toArray();
        Arrays.stream(ints)
                .forEach(s-> System.out.print(s+" "));
        System.out.println();


        /**
         * reduce():
         *
         * Purpose: Reduces the elements of the stream to a single value.
         * Common Usages:
         * BinaryOperator as a parameter, where it accumulates the elements.
         * Identity and a BinaryOperator, where it starts from the identity and accumulates the elements.
         */

        //without identity

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer product = numbers.stream()
                .reduce((a, b) -> a * b)
                .orElse(0);
        System.out.println(product);

        //with identity

        List<Integer> numberV2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numberV2.stream().reduce(0, (x, y) -> x + y);

        System.out.println("Sum of V2 :" + sum);

        //finding minimum in collection;

        IntSupplier intSupplier = () -> (int) (Math.random() * 20);
        int[] ints1 = IntStream.generate(intSupplier).limit(8).toArray();
        for(int i : ints1){
            System.out.print(i +" ");
        }
        System.out.println();
        int asInt = Arrays.stream(ints1).reduce((a, b) -> a < b ? a : b).getAsInt();
        System.out.println(asInt);

       Arrays.stream(ints1).min()
                .ifPresentOrElse(value-> System.out.println(value),
                        ()-> System.out.println("The stream is empty"));


        /**
         * collect(Collector):
         *
         * Purpose: Transforms the stream elements into a collection or another desired result.
         * Parameters: A Collector which describes how to accumulate the elements.
         */

        IntStream limit = IntStream
                .iterate(0, n -> n+1)
                .limit(10);

        List<Integer>collect = limit.boxed().collect(Collectors.toList());

        //boxed() -> Transforms the primitive `int` stream into stream of `Integer` Objects.

        collect.forEach(e-> System.out.print(e+" "));


        /**
         * count():
         *
         * Purpose: Returns the count of elements in the stream.
         * Returns: A long representing the count of elements.
         */

        long count = Stream.of(1, 2, 3).count();


        /**
         * findFirst(), findAny():
         *
         * Purpose: Retrieves elements from the stream.
         * findFirst(): Returns the first element of the stream.
         * findAny(): Returns any element from the stream,
         * which can be useful in parallel streams where the first element might not be efficiently accessible.
         * Returns: An Optional<T>
         *
         */
        System.out.println();

        Optional<Integer> first = Stream.of(1, 2, 3).findFirst();

        Optional<Integer> any = Stream.of(1, 2, 3).findAny();


        /**
         * anyMatch(Predicate<T>):
         *
         * Purpose: Determines if at least one element of the stream matches the given predicate.
         * tests whether any elements of the stream match the given predicate.
         * It's a short-circuiting terminal operation, which means it stops as soon as a matching element is found.
         * Parameters: A Predicate<T> to test the elements.
         * Returns:
         * true if at least one element matches the predicate.
         * false otherwise.
         */

        List<Integer> numbersV4 = Arrays.asList(1, 3, 5, 7, 8, 9, 11);
        boolean b = numbersV4.stream()
                .anyMatch(n -> n % 2 == 0);
      //  System.out.println(b);



        /**
         * allMatch(Predicate<T>):
         * tests whether all elements of the stream match the given predicate.
         * It's also a short-circuiting terminal operation, which means it can terminate as soon as a non-matching element is found.
         * allMatch method is very handy when you want to ensure that all elements in a stream meet a certain criteria.
         */

        List<Integer> numbersV5 = Arrays.asList(2, 4, 6, 8, 9, 11);
        boolean b1 = numbersV5.stream()
                .allMatch(n -> n % 2 == 0);
      //  System.out.println(b1);


        /**
         *noneMatch(Predicate<T>):
         * tests whether no elements of the stream match the given predicate. Like the other matching operations (allMatch and anyMatch),
         * it's a short-circuiting terminal operation, meaning it can terminate the operation as soon as a matching element is found.
         *
         */
        List<Integer> numbersV6 = Arrays.asList(1, 2, 3, 4, 5);
        boolean b2 = numbersV6.stream()
                .noneMatch(n -> n < 0);
        System.out.println(b2);


    }

}
