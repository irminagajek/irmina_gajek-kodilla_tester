package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem { //klasa dziedzicząca z OS

    public Windows7(int year) {
        super(year);
    }

    public void restartSystem() {
        System.out.println("System is restarted."); //metoda = nowa funkcjonalność restart
    }

    @Override
    public void startSystem() { //metoda nadpisana z klasy OS
        System.out.println("System 7 started.");
    }
        }
