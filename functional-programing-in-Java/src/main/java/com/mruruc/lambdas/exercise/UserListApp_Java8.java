package com.mruruc.lambdas.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UserListApp_Java8 {
    public static void main(String[] args) {

        List<User> userList = Arrays.asList(
                new User("Waflo", "Maflo@gmail.com"),
                new User("Shipoo", "Mipoo@gmail.com"),
                new User("Nelloo", "Bombeloo@gmail.com"),
                new User("Misko", "Miska@gmail.com"),
                new User("Muskoll", "Muskol@gmail.com")

        );

        ///Sort List By Email Address:

        userList.sort((user1, user2) -> user1.getEmailAddress().compareTo(user2.getEmailAddress()));

        //print all methods via a methods:

        printAll(userList);

        //method that will print users who's their name start with M letter:

        System.out.println("=============================================");

        printWithCondition(userList, user -> user.getUserName().trim().startsWith("M"));
    }

    private static void printAll(List<User> userList) {
        userList.forEach(System.out::println);
    }

    private static void printWithCondition(List<User> userList, Predicate<User> predicate) {
        for (User user : userList) {
            if (predicate.test(user)) {
                System.out.println(user);
            }
        }
    }

}

