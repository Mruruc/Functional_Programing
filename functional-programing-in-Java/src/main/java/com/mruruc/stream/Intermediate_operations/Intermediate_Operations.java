package com.mruruc.stream.Intermediate_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Intermediate operations in the Stream API are operations that transform a stream into another stream.
 * They're called "intermediate" because they return another Stream,allowing for further operations.
 * This enables chaining multiple operations together.
 * The actual computation on the source data is only performed during a terminal operation,
 * which means these intermediate operations are lazy.
 */
public class Intermediate_Operations {

    public static void main(String[] args) {

        /**
         * a. filter(Predicate<T>)
         * This operation filters the stream elements based on a predicate,
         * which is a function that takes an element and returns a boolean.
         * Elements that satisfy the predicate (i.e., for which the predicate returns true) are retained in the resulting stream.
         */

        IntStream intStream=IntStream.iterate(20,n->n+1).limit(10);

        IntPredicate intPredicate = n -> n % 2 == 0;

     //   intStream.filter(intPredicate).forEach(s-> System.out.print(s +" "));
        intStream.close();



        /**
         * . map(Function<T, R>)
         * The map operation applies a given function to each element of the stream and transforms it.
         * The function takes an element of type T and returns a new type R.
         */

        DoubleSupplier doubleSupplier = () -> {
            Double v = Math.random() * 10;
            return Math.round(v);
        };

        DoubleStream doubleStream=DoubleStream.generate(doubleSupplier).limit(15);
       // doubleStream.map(x-> Math.pow(x,2)).forEach(s-> System.out.print (s+","));
        doubleStream.close();


        /**
         *  flatMap(Function<T, Stream<R>>)
         * flatMap is used to flatten a structure.
         * It takes each element of the stream and makes it into zero or more elements in the resulting stream.
         * While map returns a stream of streams, flatMap flattens that into a single stream.
         */

        Integer [][] arr={{5,8,0},{-4,9,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        Function<Integer[], Stream<Integer>> stream =array->Arrays.stream(array);

        ArrayList<Integer> collect = Arrays.stream(arr)
                .flatMap(stream)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(collect);
      //  integerStream.forEach(s-> System.out.print(s+" "));

        /**
         * distinct()
         * This operation returns a stream with duplicate values removed, based on their natural order or their equality method (equals).
         */

        Stream<String> stringStream=Stream.of("Hello","Hello","Something");
        stringStream.distinct().forEach(System.out::println);
        stringStream.close();

        /**
         *  sorted()
         * This operation returns a stream with the elements sorted according to their natural order or based on a provided Comparator.
         */

        Stream<String> words = Stream.of("WaterMelon","banana", "apple", "cherry");
        Stream<String> sortedWords = words.sorted( (o1,o2) -> Integer.compare(o1.length(),o2.length()));

       // sortedWords.forEach(System.out::println);
        words.close();
        sortedWords.close();

        /**
         * limit(long) and skip(long)
         * limit(n) returns a stream that is no longer than the given size n.
         * skip(n) skips over the first n elements of the stream.
         */

        Stream<Integer> integerStreamv2=Stream.generate(()-> (int)(Math.random()*10)).limit(10);
        integerStreamv2.close();

        DoubleStream doubleStreamv2=DoubleStream.iterate(1.0, x-> x+1)
                                                .skip(5)
                                                .limit(10);
       //  doubleStreamv2.forEach(s -> System.out.print(s + " "));
         doubleStreamv2.close();

        /**
         * peek(Consumer<T>)
         * The peek operation is primarily meant for debugging.
         * It allows you to observe elements as they flow past a certain point in a pipeline without actually modifying them.
         */

        Stream<String> wordsV2 = Stream.of("hello", "world");
        wordsV2.peek(s-> System.out.println("Before element Mapped: " +s)).map(String::toUpperCase).forEach(System.out::println);


        /**
         * takeWhile(Predicate<T> predicate)
         * it is an intermediate operation that takes elements from the stream as long as the predicate holds true.
         * Once an element is found that doesn't satisfy the predicate, the operation stops and no further elements are included.
         */

        List<Integer> numbers = List.of(2, 4, 6, 8, 10, 12, 14);

        List<Integer> numbersLessThan10=numbers.stream()
                .takeWhile(e->e < 10)
                .toList();

        numbersLessThan10.forEach(System.out::println);




    }
}
