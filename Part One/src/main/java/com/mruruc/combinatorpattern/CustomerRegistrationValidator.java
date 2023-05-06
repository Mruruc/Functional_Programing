package com.mruruc.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.mruruc.combinatorpattern.ValidationResult.*;

public interface CustomerRegistrationValidator
        extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }
    static CustomerRegistrationValidator isAdult(){
        return (customer)->
           Period.between(customer.getBirthDate(), LocalDate.now())
                   .getYears() > 18 ?
                   SUCCESS : IS_NOT_AN_ADULT;
    }
   static CustomerRegistrationValidator isPhoneNumberValid() {
       return (customer) -> customer.getPhoneNumber()
               .startsWith("+48")
               &&
               customer.getPhoneNumber().length() == 12 ?
               SUCCESS : PHONE_NUMBER_NOT_VALID;
   }
   default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return (customer)-> {
            ValidationResult result=this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
   }
}
