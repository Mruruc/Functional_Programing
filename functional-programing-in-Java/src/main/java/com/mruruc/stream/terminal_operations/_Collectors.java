package com.mruruc.stream.terminal_operations;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _Collectors {
    public static void main(String[] args) {

        /**
         *  The Collectors class provides a set of methods to accumulate elements of a stream into a collection or other data structures.
         */


        /**
         * toList():
         *
         * Collects the stream elements into a List.
         */

        List<String> collect = Stream.of("Volvo", "BMW", "Ford").collect(Collectors.toList());

        /**
         * toSet():
         *
         * Collects the stream elements into a Set.
         */

        Set<String> collect1 = Stream.of("Volvo", "BMW", "Ford", "BMW").collect(Collectors.toSet());

        /**
         * toCollection(collectionFactory):
         *
         * Collects the stream elements into the given collection.
         */

        ArrayDeque<String> collect2 = Stream.of("Volvo", "BMW", "Ford", "BMW")
                .collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        LinkedList<String> collect4 = Stream.of("Volvo", "BMW", "Ford", "BMW")
                .collect(Collectors.toCollection(LinkedList::new));

        /**
         * toMap(keyMapper, valueMapper):
         *
         * Converts the stream elements into a Map using the key and value mapping functions.
         */

        String [] book1 = {"Book1", "Book2", "Book3"};

        String[] author={"Author1", "Author2", "Author3"};

        Map<String, String> collect3 = IntStream.range(0, author.length)
                .boxed()
                .collect(Collectors.toMap(index -> author[index], index -> book1[index]));

        collect3.forEach((key,value)-> System.out.print(key +" "+ value +"\n"));



        /**
         * groupingBy(classifier):
         * Groups the stream elements based on the classifier function.
         * it is a collector in Java's Stream API that is used to group elements of a stream
         * based on a certain property or characteristic (provided by the classifier function).
         * Essentially, it helps in partitioning the input elements according to a rule,
         * and it produces a Map where the keys represent the group identifiers and the values are lists containing elements of the group.
         *
         */

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "kiwi", "fig");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(s->s.length()));

        System.out.println(groupedByLength);


        /**
         * partitioningBy
         *
         * The partitioningBy collector is used to separate or partition the elements of a stream into two groups based on a predicate.
         * These groups are represented as a Map where the keys are of type Boolean and the values are of type List<T>.
         * The boolean key true corresponds to the group of elements that satisfy the predicate,
         * and the key false corresponds to the group of elements that do not.
         *
         * Purpose and When to Use
         * The primary purpose of partitioningBy is to divide data into two groups based on a condition.
         * It's especially handy when you want to categorize elements based on a binary condition.
         * If you need to divide data into more than two groups based on multiple conditions,
         * then you'd typically use the groupingBy collector.
         *
         * Conclusion
         * partitioningBy is a convenient collector when you have a stream of elements and
         * want to divide them into two distinct groups based on a condition. The output is a Map with boolean keys,
         * representing whether the elements satisfy the predicate or not.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven=num-> num % 2 == 0;
        Map<Boolean, List<Integer>> collect5 = numbers.stream()
                .collect(Collectors.partitioningBy(isEven));

        collect5.forEach((key,value)-> System.out.print(key +" "+value +"\n"));


        /**
         * The joining(delimiter) collector is a powerful utility in the Stream API for string concatenation operations.
         * It lets you seamlessly concatenate elements from a stream into a single string,
         * using a specified delimiter to separate each element.
         */

        String collect6 = Stream.of("Hello", "World", "How", "Are", "You", "?")
                .collect(Collectors.joining(" "));
        System.out.println(collect6);


        /**
         * mapping(mapper, downstream)
         *
         * Purpose: Transforms the type of the collected items using the provided mapper function and then collects the results using a downstream collector.
         *
         * Parameters:
         * mapper: A function to transform each input item.
         * downstream: A collector that gathers the transformed items.
         */
        System.out.println("============================");

        List<String> names=List.of("Waflo","Nelo","Shipooo");
        ArrayList<Character> collect7 = names.stream()
                .collect(Collectors.mapping(name -> name.charAt(0), Collectors.toCollection(ArrayList::new)));
    //    collect7.forEach(System.out::println);


        /**
         * Collector.of():
         * The Collector.of() method is a way to create a custom collector for specific, potentially non-standard reduction operations.
         * A reduction operation takes a sequence of input elements and combines them into a single summary result.
         *
         * The Collector.of() method requires you to specify:
         *
         * Supplier: Creates a fresh container to hold intermediate results.
         * Accumulator: Specifies how to update the container with a stream element.
         * Combiner: Specifies how to merge two containers (important for parallel processing).
         * Finisher: (Optional) Transforms the container into the final representation
         */





    }
}