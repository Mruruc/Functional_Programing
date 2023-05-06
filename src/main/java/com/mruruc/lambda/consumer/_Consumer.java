package com.mruruc.lambda.consumer;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        greetCustomer(new Customer("Maria",999999555L));

        greetCustomerConsumer.accept(new Customer("Waflo",42515153L));

    }
    static Consumer<Customer> greetCustomerConsumer=
            (customer) -> System.out.println("Hello "+ customer.name+
                    ", thanks for registering phone number "+
                    customer.phoneNo);

    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.name+
                ", thanks for registering phone number "+
                customer.phoneNo);
    }


}
