package com.thoughtworks.application;


import com.thoughtworks.Draw.DrawLine;
import com.thoughtworks.printer.Printer;

public class mainApplication {

    public static void main(String[] args) {
       new Printer().printerOnConsole( new DrawLine().drawLine(7));

    }
}
