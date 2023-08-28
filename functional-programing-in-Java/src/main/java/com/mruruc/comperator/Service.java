package com.mruruc.comperator;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Service{

    Comparator<Person> sortByName=(p1,p2) -> p1.getName().compareTo(p2.getName());
    Comparator<Person> sortByAge = (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge());

   Function<List<Person>,List<Person>> sortByNameThenByAge=l ->{
      return l.stream()
                .sorted(sortByName.thenComparing(sortByAge))
                .toList();
    };
}

