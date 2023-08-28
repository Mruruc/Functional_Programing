package com.mruruc.stream.specialized_streams;

import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Specialized_Streams {

    /**
     * Java introduced specialized streams like IntStream, LongStream, and DoubleStream
     * primarily to address performance issues and offer more efficient operations on primitive data types than
     * using a general Stream with boxed objects (like Integer, Long, Double).
     *
     * Specialized Streams:
     * IntStream: Represents a sequence of primitive int values.
     * LongStream: Represents a sequence of primitive long values.
     * DoubleStream: Represents a sequence of primitive double values.
     *
     * Each of these specialized streams has methods tailored for its specific type. Here are some key methods and utilities:
     *
     * range(), rangeClosed(): Used to generate sequences of numbers.
     * sum(): Computes the sum of numbers in the stream.
     * average(): Computes the average of numbers.
     * min(), max(): Find the minimum or maximum value.
     * mapToDouble(), mapToLong(), mapToInt(): Convert from one specialized stream to another.
     */

    public static void main(String[] args) {

        /**
         * Converting between general and specialized streams:
         * Conversions often occur between general streams (Stream<T>) and specialized streams to optimize performance:
         *
         * mapToInt(), mapToLong(), mapToDouble(): Converts from a general stream to a specialized one.
         * boxed(): Converts from a specialized stream to a general one.
         */

        List<Integer> nums=List.of(1,6,5,6,7,9);

        IntSummaryStatistics intSummaryStatistics = nums.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);


        LinkedList<Integer> linkedList =
                IntStream.range(0, 5)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedList::new));

        linkedList.forEach(System.out::println);

        /**
         * Note:
         *
         * To summarize, specialized streams offer performance advantages and tailored operations for primitive types.
         * They can be seamlessly converted to and from general streams using provided methods, ensuring a fluid and optimized programming experience.
         */

    }
}
