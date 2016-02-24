package com.thoughtworks.FizzBuzz;


public class FizzBuzz {

    private final FizzBuzzConverter converter;

    public FizzBuzz(FizzBuzzConverter converter) {
        this.converter = converter;
    }

    public String returnNumbers() {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            result += converter.numberConvert(i);
        }
        return result;
    }



}
