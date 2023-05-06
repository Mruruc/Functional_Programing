package com.mruruc.lambda.funcations;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        Integer result= incrementByOneAndMultiply(1,10);
        System.out.println(result);

    }
    //Type of First Argument,type of second Argument,type of Result.
    BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction=
            (numToIncrementByOne,numToMultiplyBy)
                    -> (numToIncrementByOne + 1) * numToMultiplyBy ;

    static int incrementByOneAndMultiply(int numToIncrementByOne
            ,int numToMultiplyBy){

        return ((numToIncrementByOne + 1) * numToMultiplyBy);
    }

}
