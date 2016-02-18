package com.twu.draw;

public class DrawLine {

    public String drawLine(int numberOfAsterisks,String separator) {
        String line = "";
        for (int i = 0; i < numberOfAsterisks; i++) {
            line += "*"+ separator;
        }
        System.out.print(line);
        return line;
    }


}
