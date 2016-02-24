package com.thoughtworks.controll;

public class DrawAsterisks {


    public String drawAsterisks(int value){
        String asterisksStrings = "";

        for (int i = 0; i < value; i++){
            asterisksStrings += "*";
        }

        return asterisksStrings;
    }
}
