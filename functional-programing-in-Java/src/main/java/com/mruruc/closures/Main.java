package com.mruruc.closures;

public class Main {

    public static void main(String[] args) {



        doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(Math.log10(i));
            }
        });

        doProcess(10,x-> System.out.println(Math.log10(x)));
    }

    private static void doProcess(int i,Process p){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}