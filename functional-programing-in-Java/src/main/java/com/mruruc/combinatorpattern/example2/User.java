package com.mruruc.combinatorpattern.example2;


import java.time.LocalDate;

public class User {
    private String email;
    private String phone;
    private LocalDate birthDate;

    public User(String email, String phone, LocalDate birthDate) {
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return this.email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
