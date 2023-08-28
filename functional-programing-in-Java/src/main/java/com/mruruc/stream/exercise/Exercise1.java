package com.mruruc.stream.exercise;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.mruruc.stream.exercise.Exercise1.Gender.FEMALE;
import static com.mruruc.stream.exercise.Exercise1.Gender.MALE;

public class Exercise1 {
    public static void main(String[] args) {

        List<Person> people= List.of(
                new Person("John",MALE),
                new Person("Maria",FEMALE),
                new Person("Aisha",FEMALE),
                new Person("Alice",FEMALE),
                new Person("Wafloo",MALE)
        );
        people.stream()
               .map((person) -> person.gender)
                .collect(Collectors.toSet())
               .forEach(System.out::println);
        System.out.println("======================================");

        Function<Person, String> personStringFunction =
                (person) -> person.name;

        Function<String, Integer> length = (str)-> str.length(); //String::length;

        Consumer<Integer> println = (x)-> System.out.println(x); //String.out::println;

        people.stream()
                .map(personStringFunction)
                .map(length)
                .forEach(println);
        System.out.println("===============================================");

//        Function<Person,String> femalePerson=
//                (person)-> person.gender.equals(FEMALE) ? person.name : "";
//        Consumer<String> print=
//                (name)-> System.out.println(name);

        people.stream()
                .map((person)->person.gender.equals(FEMALE) ?
                        person.name :"")
                .forEach(System.out::println);

    }
    static String females(Person person){
        if(person.gender.equals(FEMALE)){
            return person.name;
        }
        return "";
    }
   static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE,FEMALE
    }


}
