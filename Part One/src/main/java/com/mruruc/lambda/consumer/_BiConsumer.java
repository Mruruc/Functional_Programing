package com.mruruc.lambda.consumer;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Shipoo",2886838L),
                true);
        greetCustomerBiConsumer.accept(new Customer("Shipoo",2886838L),
                false);
    }

    static BiConsumer<Customer,Boolean> greetCustomerBiConsumer=
            (customer,showOrNo)->
                    System.out.println(
                            "Hello "+ customer.name+
                             ", thanks for registering phone number "+
                             (showOrNo ?  customer.phoneNo : "*********")
                    );

    static void greetCustomer(Customer customer,Boolean showOrNo){
        System.out.println(
                "Hello "+ customer.name+
                ", thanks for registering phone number "+
                (showOrNo ?  customer.phoneNo : "*********")
        );
    }

}
