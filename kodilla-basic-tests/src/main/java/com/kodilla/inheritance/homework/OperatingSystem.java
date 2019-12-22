package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year; //informacja o roku wydania

public OperatingSystem(int year) {//konstruktor przyjmujący rok wydawania
    this.year = year;
    }

    public void displayReleaseYear() { //metoda wyświetlająca rok wydania
        System.out.println("Release year: " + year);
    }

    public void turnOnSystem() {
    System.out.println("Operating System is turned on."); //metoda uruchamiająca system
    }

    public void turnOffSystem() {
System.out.println("Operating System is turned off."); //metoda wyłączająca system
    }

    public void startSystem() {
        System.out.println("System started.");
    }

    public int getYear() { //getter = metoda, która zwraca wartość, nic nie modyfikuje
    return year;
    }
}
