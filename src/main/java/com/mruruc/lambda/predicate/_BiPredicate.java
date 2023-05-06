package com.mruruc.lambda.predicate;

import java.util.function.BiPredicate;
/*
* BiPredicate interface is used to in case of:
* needed two argument and returning boolean type.
*/
public class _BiPredicate {
    public static void main(String[] args) {
        System.out.println(
                twoArgumant(17,false)
        );

    }

    static BiPredicate<Integer,Boolean> twoArgument=
            (age,fullTime)->
             age >18 && fullTime==true;
    static boolean twoArgumant(int age, boolean fullTime){
        return age >18 && fullTime==true;
    }
}
