package com.thoughtworks.model;


public class Diamond {

    public void drawCenterTriangle(int numberOfLines){
        for(int i = 0; i < numberOfLines ; i++) {
            drawCenterLine(i, numberOfLines);
        }
    }

    public void drawCenterLine(int i, int numberOfLines){
        int numberOfSpaces = numberOfSpaces(i, numberOfLines);
        int numAsterisk = findNumberOfAsterisk(i);

        printSpaces(numberOfSpaces);
        printAsterisks(numAsterisk);
        System.out.println();
    }

    public void reverseLoop(int numberOfLines){

        for(int i = numberOfLines - 2; i >= 0 ; i--) {
            drawCenterLine(i, numberOfLines);
        }
    }



    public int numberOfSpaces(int i, int numberOfLines){
        return numberOfLines - i - 1;
    }

    public int findNumberOfAsterisk(int i){
        return 2 * i + 1;
    }

    public void printSpaces(int numSpaces){
        for(int i = 1; i <= numSpaces; i++){
            System.out.print(" ");
        }
    }

    public void printAsterisks(int numAsterisk){
        for(int i = 1; i <= numAsterisk; i++){
            System.out.print("*");
        }
    }
}
