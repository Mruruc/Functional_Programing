package com.mruruc.lambdas.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserListApp_Java7 {

    public static void main(String[] args) {

        List<User> userList= Arrays.asList(
                new User("Waflo","Maflo@gmail.com"),
                new User("Shipoo","Mipoo@gmail.com"),
                new User("Nelloo","Bombeloo@gmail.com"),
                new User("Misko","Miska@gmail.com"),
                new User("Muskoll","Muskol@gmail.com")

        );

        ///Sort List By Email Address:

        userList.sort(new Comparator<User>() {
                          @Override
                          public int compare(User o1, User o2) {
                              return o1.getEmailAddress().compareTo(o2.getEmailAddress());
                          }
                      }

        );

        //print all methods via a methods:

        printAll(userList);

        //method that will print users who's their name start with M letter:

        System.out.println("=============================================");

        printWithCondition(userList, new Condition() {
                    @Override
                    public boolean test(User user) {
                        return user.getUserName().trim().startsWith("M");
                    }
                }
        );
    }

    private static void printWithCondition(List<User> userList, Condition condition) {
        for (User user: userList){
            if(condition.test(user)){
                System.out.println(user);
            }
        }
    }

    private static void printAll(List<User> userList) {
        for (User user:userList) {
            System.out.println(user);
        }
    }
}

interface Condition{
    boolean test(User user);
}

