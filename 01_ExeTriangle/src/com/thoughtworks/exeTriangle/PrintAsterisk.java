package com.thoughtworks.exeTriangle;


public class PrintAsterisk {

    public boolean printerAsteriskOnConsole(String  value) {

        if (value.equals("*")) {
            System.out.print(value);
            return true;
        }

        return false;
    }
}
