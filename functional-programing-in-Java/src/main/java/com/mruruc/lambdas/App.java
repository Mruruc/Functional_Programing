package com.mruruc.lambdas;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        /**
         * pure object-oriented and polymorphism.
         */

        System.out.println("================Pure Object-Oriented ===============");
        Greet greeter = new Greet();

        HelloWorldGreeting hello = new HelloWorldGreeting();
        Greeting greeting = new HelloWorldGreeting();

        greeter.greet(greeting);
        greeter.greet(hello);

        System.out.println("================Lambda Expression ===============");

        Greeting greetLambda = () -> System.out.println("Hello From Lambda");
        greetLambda.perform();


        Greeting innerClass = new Greeting() {
            public void perform() {
                System.out.println("Something From Inner Class!");
            }
        };

        innerClass.perform();

        hi(() -> System.out.println("Something"));

    }

    public static void hi(Greeting greeting) {
        greeting.perform();
    }

}
