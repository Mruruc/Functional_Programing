package com.mruruc.optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

//        var integer = Optional.ofNullable(256564)
//                .orElseThrow(() -> new NullPointerException());
//        System.out.println(integer);
        var o = Optional.ofNullable("Heloo")
                .orElseGet(() -> "default value");
        System.out.println(o);

    }



}
