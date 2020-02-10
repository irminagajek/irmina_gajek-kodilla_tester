package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOnSystem() {
        System.out.println("Operating System is turned on.");
    }

    public void turnOffSystem() {
        System.out.println("Operating System is turned off.");
    }

    public int getYear() {
        return year;
    }
}
