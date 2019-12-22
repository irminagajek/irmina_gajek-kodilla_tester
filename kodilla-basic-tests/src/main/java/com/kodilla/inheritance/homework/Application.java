package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOnSystem();

        Windows7 windows7 = new Windows7(2009);
        windows7.displayReleaseYear();

        Windows10 windows10 = new Windows10(2015);
        windows10.displayReleaseYear();
    }
}

