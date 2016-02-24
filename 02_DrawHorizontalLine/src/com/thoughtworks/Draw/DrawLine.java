package com.thoughtworks.Draw;

public class DrawLine {


    public String drawLine(int numberOfAsterisks){
        String line = "";

        for(int i = 0; i < numberOfAsterisks; i++){
            line += "*";
        }
       return line;
    }

}
