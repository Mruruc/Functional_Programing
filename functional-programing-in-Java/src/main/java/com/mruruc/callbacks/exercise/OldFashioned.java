package com.mruruc.callbacks.exercise;

import java.time.LocalDateTime;

interface CallBack{
    void onComplete();
}
class Worker{

    public void doWork(CallBack callBack){
        System.out.println("Working......");

        callBack.onComplete();
    }
}
public class OldFashioned {

    public static void main(String[] args) {

        Worker worker=new Worker();
        worker.doWork(
                new CallBack() {
                    @Override
                    public void onComplete() {
                        System.out.println("Work is Completed at " + LocalDateTime.now());
                    }
                }
        );
    }
}
