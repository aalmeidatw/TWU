package com.thoughtworks.application;


import com.thoughtworks.controll.DrawAsterisks;
import com.thoughtworks.print.Printer;

public class main {


    public static void main(String[] args) {
        new Printer().printerOnConsole(new DrawAsterisks().drawAsterisks(2));
    }


}
