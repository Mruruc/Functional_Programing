package com.mruruc.exception_Handling;

import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {
        int[] arr={4,4,9,-5,6,-2,0};
        int key=0;

        process(arr,key,wrapper((v,k)-> System.out.println(v/k)));



    }

    private static void process(int[] arr, int key, BiConsumer<Integer,Integer> consumer) {
        for (int element:arr) {
            consumer.accept(element,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapper(BiConsumer<Integer,Integer> consumer){
        return (v,k)->{
          try{
              consumer.accept(v,k);
          }
          catch (Exception e){
              System.out.println(e.getMessage());
          }
        };
    }
}
