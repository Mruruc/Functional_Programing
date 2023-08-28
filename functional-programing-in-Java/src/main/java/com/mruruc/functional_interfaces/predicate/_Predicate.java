package com.mruruc.functional_interfaces.predicate;

import java.util.function.Predicate;

/**
 * Represents a single argument function that returns a boolean value.
 * Its primary purpose is to evaluate a condition on its input and return true or false based on the condition.
 */
public class _Predicate {
    public static void main(String[] args) {

        System.out.println("My custom Predicate Interface: ");

        boolean myCustomResult=isEven.execute(33);
        System.out.println(myCustomResult);

        System.out.println("=========PreDefined Predicate Interface==========");

        boolean test1 = isStartWith.test("+48752435698");
        System.out.println(test1);

        //chaining with and both function should return true:
        boolean test2 = isStartWith.and(lengthOfNumber).test("+44752435698");
        System.out.println(test2);

    }

    static Predicate<String> isStartWith=(phoneNumber)-> phoneNumber.trim().startsWith("+48");
    static Predicate<String> lengthOfNumber=(phoneNumber)->phoneNumber.trim().length()==12;

    static My_Predicate<Integer> isEven=(x)-> {
        if(x % 2==0){
            return true;
        }
        return false;
    };

}
