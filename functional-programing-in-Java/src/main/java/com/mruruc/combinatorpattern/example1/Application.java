package com.mruruc.combinatorpattern.example1;

import com.mruruc.combinatorpattern.example1.Customer;
import com.mruruc.combinatorpattern.example1.ValidationResult;

import java.time.LocalDate;

import static com.mruruc.combinatorpattern.example1.CustomerRegistrationValidator.*;

public class Application {
    public static void main(String[] args) {

        Customer customer=new Customer(
                "Alice",
                "alice@gmail.com",
                "+48564230112",
                LocalDate.of(2000,4,7)
        );


//        CustomerValidatorService validatorService=new CustomerValidatorService();
//        System.out.println(validatorService.isValid(customer));

        //Using combinator pattern:

        ValidationResult result =isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

       if(result!=ValidationResult.SUCCESS){
           throw new IllegalStateException(result.name());
       }

    }
}
