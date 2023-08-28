package com.mruruc.functional_interfaces.consumer;
import java.util.List;
import java.util.function.Consumer;

public class Exercise {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Using anonymous inner class
        names.forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );

        System.out.println("==============================================");

        //// Using lambda expression (simpler)

        names.forEach((name)-> System.out.print (name+" "));
        System.out.println();

        System.out.println("==============================================");

        //Using methods references
        names.forEach(System.out::println);

    }
}
