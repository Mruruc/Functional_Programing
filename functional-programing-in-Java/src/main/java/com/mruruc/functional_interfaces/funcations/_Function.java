package com.mruruc.functional_interfaces.funcations;

import com.mruruc.functional_interfaces.funcations.custom_interface.My_Function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        System.out.println("My custom Function Interface: ");

        Integer myCustomResult=decrement.execute(100);
        System.out.println(myCustomResult);

        System.out.println("=========PreDefined Function Interface==========");
        Integer result = increment.apply(5);
        System.out.println(result);

        Integer resultV2=multiplyBy10.apply(10);
        System.out.println(resultV2);

        Integer resultV3 = getIncrementAndMultiplyBy10.apply(5);
        System.out.println(resultV3);

    }

    static Function<Integer,Integer> multiplyBy10= (x)->x*10;

    static Function<Integer,Integer> increment=(x)->x+1;

    static Function<Integer,Integer> getIncrementAndMultiplyBy10= increment.andThen(multiplyBy10);


    static My_Function<Integer,Integer> decrement=(x)->x-1;
}
