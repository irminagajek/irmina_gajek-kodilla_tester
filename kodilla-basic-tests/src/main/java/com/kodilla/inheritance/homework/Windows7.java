package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem {

    public Windows7(int year) {
        super(year);
        System.out.println("Date of release: " + year);
    }

    @Override
    public void turnOnSystem() {
        System.out.println("Windows 7 is turned on.");
    }

    @Override
    public void turnOffSystem() {
        System.out.println("Windows 7 is turned off.");
    }
}