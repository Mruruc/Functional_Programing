package com.mruruc.imperative_approach;

import java.util.ArrayList;
import java.util.List;

import static com.mruruc.imperative_approach.Gender.FEMALE;
import static com.mruruc.imperative_approach.Gender.MALE;


public class ImperativeApproach {
    public static void main(String[] args) {
        List<Person> people= List.of(
        new Person("John",MALE),
        new Person("Maria",FEMALE),
        new Person("Aisha",FEMALE),
        new Person("Alice",FEMALE),
        new Person("Wafloo",MALE)
        );

        //Imperative APPROACH:
        List<Person> females=new ArrayList<>();

        for(Person person:people){
            if(Gender.FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        }
    }
}
