package com.mruruc.functional_interfaces.funcations;

import com.mruruc.functional_interfaces.funcations.custom_interface.My_BiFunction;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {

        System.out.println("My custom BiFunction Interface: ");

        Double myCustomResult=addition.execute(100.0,100.0);
        System.out.println(myCustomResult);

        System.out.println("=========PreDefined Function Interface==========");

       Integer result = subtraction.apply( 100, 100);
        System.out.println(result);

    }
    static BiFunction<Integer,Integer,Integer> subtraction=(a,b)-> a-b;

    static My_BiFunction<Double,Double,Double> addition= Double::sum;
}
