package com.mruruc.functional_interfaces.supplier;


public class Exercise {
    public static void main(String[] args) {

        Integer num = randomNumber.execute();
        System.out.println(num);

    }
  static My_Supplier<Integer> randomNumber=()-> (int) (Math.random()*5);
}
