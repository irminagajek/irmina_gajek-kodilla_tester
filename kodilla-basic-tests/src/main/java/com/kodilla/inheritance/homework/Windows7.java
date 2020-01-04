package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem {

    public Windows7(int year) {
        super(year);
    }

    public void restartSystem() {
        System.out.println("System is restarted.");
    }

    @Override
    public void startSystem() {
        System.out.println("System 7 started.");
    }
}
