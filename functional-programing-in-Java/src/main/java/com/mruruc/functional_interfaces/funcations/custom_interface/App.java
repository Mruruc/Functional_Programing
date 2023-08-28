package com.mruruc.functional_interfaces.funcations.custom_interface;

public class App {
    public static void main(String[] args) {

        CalculatorAPI calculatorAPI=new CalculatorAPI();
        double result=calculatorAPI.exponentially.execute(2.0);
        System.out.println(result);


         var resultv2 =calculatorAPI.division.execute(4.0,2.0);
        System.out.println(resultv2);



    }
}
