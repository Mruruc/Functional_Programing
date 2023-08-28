package com.mruruc.functional_interfaces.predicate;

import java.util.function.BiPredicate;
/*
* BiPredicate interface is used to in case of:
* needed two argument and returning boolean type.
*/
public class _BiPredicate {
    public static void main(String[] args) {

        boolean fullTime=true;

        boolean test = twoArgument.test(19, fullTime);
        System.out.println(test);
    }

    static BiPredicate<Integer,Boolean> twoArgument=
            (age,fullTime)->
             age >18 && fullTime;
}
