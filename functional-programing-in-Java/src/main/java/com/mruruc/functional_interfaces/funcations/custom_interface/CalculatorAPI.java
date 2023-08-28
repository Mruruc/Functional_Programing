package com.mruruc.functional_interfaces.funcations.custom_interface;

public class CalculatorAPI {
    My_Function<Double,Double> exponentially=(a)->a * a;

    My_BiFunction<Double,Double,Double> addition=(a, b)-> a + b;
    My_BiFunction<Double,Double,Double> subtraction=(a, b)-> a - b;

    My_BiFunction<Double,Double,Double> multiplication =(a, b)-> a * b;

    My_BiFunction<Double,Double,Double> division=(a,b)-> {
        if(b==0){
            throw new IllegalArgumentException("Denominator ca not be zero!");
        }
        return a / b;
    };

}

