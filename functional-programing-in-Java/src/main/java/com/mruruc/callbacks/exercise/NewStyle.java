package com.mruruc.callbacks.exercise;

import java.time.LocalDateTime;


class Employee{
    public void doWork(CallBack callback){
        System.out.println("Started work at :" +LocalDateTime.now());

      callback.onComplete();
    }
}
public class NewStyle {

    public static void main(String[] args) {

        Employee employee=new Employee();

        employee.doWork(()-> System.out.println("Done at :"+ LocalDateTime.now().getHour()));

    }
}
