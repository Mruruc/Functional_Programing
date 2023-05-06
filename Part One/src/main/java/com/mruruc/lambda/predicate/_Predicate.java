package com.mruruc.lambda.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
     /*   System.out.println(isPhoneNumberValid("+48056556555"));
        System.out.println(isPhoneNumberValid("+4805655655"));*/
        System.out.println(
                isPhoneNumberValidPredicate.test("+48056556553")
        );
        boolean result= isPhoneNumberValidPredicate.test("+48056556553");
        System.out.println(result);
        System.out.println("Imperative function: " +contains("+48052356553"));
        System.out.println("Declarative function: "+
                isPhoneNumberValidPredicate.test("+48056556553")
        );

        //chaining with and both function should return true:
        System.out.println(
                ""+
        isPhoneNumberValidPredicate.and(isPhoneNumberContainPredicate)
                .test("+48056523553")
        );

    }
    static Predicate<String> isPhoneNumberContainPredicate=
            (phoneNumber)->phoneNumber.contains("23");
    static boolean contains(String phoneNumber){
        return phoneNumber.contains("23");
    }
    static Predicate<String> isPhoneNumberValidPredicate=
            (phoneNumber)-> phoneNumber.startsWith("+48")
                    && phoneNumber.length()==12;

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+48")
                && phoneNumber.length()==12;
    }
}
