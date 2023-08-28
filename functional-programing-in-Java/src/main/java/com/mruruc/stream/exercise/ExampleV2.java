package com.mruruc.stream.exercise;

import java.util.List;
import java.util.stream.Stream;

public class ExampleV2 {
    public static void main(String[] args) {
        List<User> list= List.of(

                new User(1, "John", "Doe"),
                new User(2, "Jane", "Doe"),
                new User(3, "Alice", "Smith"),
                new User(4, "Bob", "Brown"),
                new User(5, "Charlie", "Johnson"),
                new User(6, "David", "Williams"),
                new User(7, "Eve", "Jones"),
                new User(8, "Frank", "Miller"),
                new User(9, "Grace", "Doe"),
                new User(10, "Helen", "Garcia")
        );

        Stream<User> stream = list.stream();
        long count = stream.count();
        System.out.println(count);

        //collect User with Doe lastName into a new list.
        List<User> doe = list.stream().filter(user -> user.lastName().equals("Doe")).toList();
        doe.forEach(System.out::println);

    }
}

record User(Integer id,String firstName,String lastName){}