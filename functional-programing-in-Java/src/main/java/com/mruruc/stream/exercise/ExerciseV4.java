package com.mruruc.stream.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseV4 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Eva", "B")
        );

        Map<String, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(student -> student.grade()));

        collect.forEach((key,value)-> System.out.print(key+"  "+value +"\n"));
    }
}


record Student(String name,String grade){}