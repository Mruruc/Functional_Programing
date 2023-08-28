package com.mruruc.combinatorpattern.example2;

public class Understanding_ValidationResultV2 {

    public static void main(String[] args) {

        ValidationResultV2 resultV2=()-> "Success";
        resultV2.reason();

        String reason = ValidationResultV2.success().reason();
        System.out.println(reason);

        String reason1 = ValidationResultV2.failure("Not Adult!").reason();
        System.out.println(reason1);


    }
}
