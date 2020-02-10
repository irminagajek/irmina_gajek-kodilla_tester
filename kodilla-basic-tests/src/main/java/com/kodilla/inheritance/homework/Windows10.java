package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {

    public Windows10(int year) {
        super(year);
        System.out.println("Date of release: " + year);
    }

    @Override
    public void turnOnSystem() {
        System.out.println("Windows 10 is turned on.");
    }

    @Override
    public void turnOffSystem() {
        System.out.println("Windows 10 is turned off.");
    }
}