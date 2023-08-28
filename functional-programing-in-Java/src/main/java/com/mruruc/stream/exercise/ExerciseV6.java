package com.mruruc.stream.exercise;

import java.util.Arrays;
import java.util.List;

public class ExerciseV6 {
    public static void main(String[] args) {
        List<StudentV2> students = Arrays.asList(
                new StudentV2("Alice", 70),
                new StudentV2("Bob", 85),
                new StudentV2("Charlie", 40),
                new StudentV2("David", 90)
        );

        // Check any Student has grade less than 50;

        boolean b = students.stream()
                .anyMatch(s -> s.grade() > 50);
        if(b){
            System.out.println("There is at least one student with less grade than 50");
        }

    }
}
record StudentV2(String name,int grade){ }
