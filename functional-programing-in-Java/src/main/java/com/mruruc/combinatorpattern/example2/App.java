package com.mruruc.combinatorpattern.example2;


import java.time.LocalDate;

import static com.mruruc.combinatorpattern.example2.UserRegistrationValidator.isAdult;
import static com.mruruc.combinatorpattern.example2.UserRegistrationValidator.isPhoneValid;

public class App {

    public static void main(String[] args) {

        User user = new User("test@email.com",
                "+48345678901",
                LocalDate.of(2006, 6, 7));

        ValidationResultV2 validate = isPhoneValid().and(isAdult()).validate(user);

        System.out.println(validate.reason());



    }
}
