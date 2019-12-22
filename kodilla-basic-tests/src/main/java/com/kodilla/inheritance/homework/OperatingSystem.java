package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

public OperatingSystem(int year) {
    this.year = year;
    }

    public void displayReleaseYear() { //metoda wyświetlająca rok wydania
        System.out.println("Release year: " + year);
    }

    public void turnOnSystem() {
    System.out.println("Operating System is turned on.");
    }

    public void turnOffSystem() {
System.out.println("Operating System is turned off.");
}

    public void startSystem() {
        System.out.println("System started.");
    }

    public int getYear() { //getter = metoda, która zwraca wartość, nic nie modyfikuje
    return year;
    }
}
