package com.mruruc.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isEmailValid(String email){
        return email.contains("@");
    }
    private static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+48")
                && phoneNumber.length()==12;
    }
    private boolean isAdult(LocalDate dateBirth){
        return Period.between(dateBirth,LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getBirthDate()) ;
    }
}
