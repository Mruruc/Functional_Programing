package com.mruruc.combinatorpattern.example2;
@FunctionalInterface
public interface ValidationResultV2 {
    static ValidationResultV2 success(){
        return ()-> "Success";
    }

    static ValidationResultV2 failure(String reason){
        return ()-> reason;
    }
    String reason();
}
