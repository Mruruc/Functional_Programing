package com.mruruc.combinatorpattern.example2;

import java.time.LocalDate;
import java.time.Period;

@FunctionalInterface
public interface UserRegistrationValidator {

    ValidationResultV2 validate(User user);

    static UserRegistrationValidator isPhoneValid(){
        return (user)->( user.getPhone().trim().startsWith("+48")
                         && user.getPhone().trim().length()==12 ) ?
         ValidationResultV2.success() : ValidationResultV2.failure("Phone Number Is Not Valid!");
    }

    static UserRegistrationValidator isAdult() {
        return user ->
                (Period.between(user.getBirthDate(), LocalDate.now())
                        .getYears() >= 18) ?
                        ValidationResultV2.success() : ValidationResultV2.failure("IS NOT ADULT!");

    }

    default UserRegistrationValidator and(UserRegistrationValidator other){
        return user -> {
            ValidationResultV2 result=this.validate(user);
            return result.equals(ValidationResultV2.success()) ? other.validate(user) : result ;
        };
    }



}
