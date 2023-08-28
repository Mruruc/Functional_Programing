package com.mruruc.comperator;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Understanding_Comparator {

    public static void main(String[] args) {

        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("Alice", 28);
        Person person4 = new Person("Bob", 35);
        Person person5 = new Person("Charlie", 40);
        Person person6 = new Person("Daisy", 22);


        List<Person> list= List.of(person1,person2,person3,person4,person5,person6);

        list.forEach(System.out::println);
        System.out.println("============================");
        Service service=new Service();
        List<Person> sortedList = service.sortByNameThenByAge.apply(list);

        sortedList.forEach(System.out::println);

    }
}
