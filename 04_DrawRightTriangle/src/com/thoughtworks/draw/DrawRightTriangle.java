package com.thoughtworks.draw;

public class DrawRightTriangle {


    public void drawRightTriangle(int numberOfAsterisks){

        for (int i = 0; i < numberOfAsterisks; i++) {
            drawHorizontalLine(i);
            System.out.print("\n");
        }
    }


    public void drawHorizontalLine( int numberOfAsterisk){

        for(int i = 0; i <= numberOfAsterisk; i++ ){
            System.out.print("*");
         }
    }
}
