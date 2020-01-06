package com.kodilla.collections.interfaces.homework;

import org.w3c.dom.ls.LSOutput;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(0, 50, 30);
        doRace(opel);
        Ford ford = new Ford(0, 40, 10);
        doRace(ford);
        Skoda skoda = new Skoda(0, 40, 25);
        doRace(skoda);
    }

    private static void doRace(Car car) {
        System.out.println(car.getSpeed());
    }
}
