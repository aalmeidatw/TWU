package com.thoughtworks.FizzBuzz;


public class FizzBuzzConverter {

    public String numberConvert(int number) {

        String result = "";

        if (isDivisible(number, 3)) {
            result += "Fizz";
        }

        if (isDivisible(number, 5)) {
            result += "Buzz";
        }

        if (result.equals("")) {
            return String.valueOf(number);
        }

        return result;
    }

    public boolean isDivisible(int number, int divisible){
        return ((number % divisible) == 0);
    }

}
