package com.thoughtworks.application;


import com.thoughtworks.draw.DrawLine;
import printer.Printer;

public class mainApplication {
    public static void main(String[] args) {
        new Printer().printerInConsole( new DrawLine().drawLine(2, "\n"));

    }
}
