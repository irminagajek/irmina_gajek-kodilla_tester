package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {

    public Windows10(int year) {
        super(year);
    }

    @Override
    public void startSystem() {
        System.out.println("System 10 started.");
    }

    public void saveChanges() {
        System.out.println("Changes were saved.");
    }
}
