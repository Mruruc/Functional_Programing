package com.mruruc.declarative_approach;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static com.mruruc.declarative_approach.Gender.FEMALE;
import static com.mruruc.declarative_approach.Gender.MALE;

public class App {
    public static void main(String[] args) {

        List<Person> people=List.of(
                new Person("John",MALE),
                new Person("Maria",FEMALE),
                new Person("Aisha",FEMALE),
                new Person("Alice",FEMALE),
                new Person("Wafloo",MALE)
        );

        //Declarative approach:

        Predicate<Person> personPredicate = (person) -> MALE.equals(person.getGender());

        Collector<Person, ?, List<Person>> personListCollector = Collectors.toList();

        people.stream()
                .filter(personPredicate)
                .collect(personListCollector)
                .forEach(System.out::println);

    }
}
