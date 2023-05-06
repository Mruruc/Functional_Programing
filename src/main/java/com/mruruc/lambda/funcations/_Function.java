package com.mruruc.lambda.funcations;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment=increment(3);
        System.out.println(increment);

       // Integer increment2=(Integer) incrementByOneFunction.myApply(3);

       int increment3= incrementByOneFunction2.apply(3);
        System.out.println(increment3);
        System.out.println(
                multiplyByTenFunction.apply(increment3)
        );
       /* Integer resultOfTwoFunction= multiplyTenAndThenAddOne.apply(7);
        System.out.println(resultOfTwoFunction);*/


        Function<Integer,Integer>multiplyTenAndThenAddOne=
                incrementByOneFunction2.andThen(multiplyByTenFunction);

        Integer resultOfTwoFunction=multiplyTenAndThenAddOne.apply(7);
        System.out.println(resultOfTwoFunction);



    }
  /*  static  ByOneFunction<Integer,Integer> incrementByOneFunction=
            (number) -> number + 1;*/

 /*  Function<Integer,Integer> multiplyTenAndThenAddOne=
          incrementByOneFunction2.andThen(multiplyByTenFunction);
          */

    static  Function<Integer,Integer> multiplyByTenFunction =
          (number) -> number * 10;
    static Function<Integer,Integer> incrementByOneFunction2 =
            (number)-> number + 1;


   public static int increment(int number){
        return number + 1;
    }
}
