package com.thoughtworks.controll;


import com.thoughtworks.print.Printer;

public class DrawAsterisks {


    public String drawAsterisks(int value){
        String asterisksStrings = "";

        for (int i = 0; i <= value; i++){
            asterisksStrings += asterisksStrings;
        }

        return asterisksStrings;
    }
}
