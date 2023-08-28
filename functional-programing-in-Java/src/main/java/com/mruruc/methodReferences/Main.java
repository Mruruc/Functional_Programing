package com.mruruc.methodReferences;

/**
 * A Method Reference is a shorthand notation of a lambda expression to call a method.
 * it is calling an existing method, then it's often clearer to refer to the method by name rather than use the lambda.
 *
 */

public class Main {
    public static void main(String[] args) {

        InterfaceExample example0=()-> System.out.println("Normal Lambda expression");
        example0.perform();

        InterfaceExample example=Main::printSomethingv1;  //// using static method reference
        example.perform();

        Main main=new Main();
        InterfaceExample example2=main::printSomethingv2;
        example2.perform();
    }

    private static void printSomethingv1() {
        System.out.println("using static method reference");
    }

    private  void printSomethingv2() {
        System.out.println("using  method reference");
    }


}
