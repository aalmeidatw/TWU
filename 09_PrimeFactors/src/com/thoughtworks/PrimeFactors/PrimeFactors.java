package com.thoughtworks.PrimeFactors;


import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> returnSequenceOfFactors(int value) {

        List<Integer> numberFactors = new ArrayList<Integer>();

        for (int i = 2; i <= value; i++) {
            while (isDivisible(value, i )) {
                numberFactors.add(i);
                value /= i;
            }
        }
        return numberFactors;
    }

    private boolean isDivisible(int value, int divisor){
        return ((value % divisor) == 0);

    }
}

