package com.thoughtworks.controll;


import com.thoughtworks.print.Printer;

public class DrawAsterisks {
    private Printer printer;

    public void drawAsterisks(String value){
        this.printer = new Printer();

        if (value.equals("*")) {
            printer.printerOnConsole("*");

        }
    }
}
