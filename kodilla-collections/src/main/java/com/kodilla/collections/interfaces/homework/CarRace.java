package com.kodilla.collections.interfaces.homework;

import org.w3c.dom.ls.LSOutput;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(80, 50, 40);
        doRace(opel);
        Ford ford = new Ford(100, 30, 10);
        doRace(ford);
        Skoda skoda = new Skoda(70, 40, 25);
        doRace(skoda);
    }

    private static void doRace(Car car) {
        int getSpeed = car.getSpeed() + car.increaseSpeed() + car.increaseSpeed() + car.increaseSpeed() - car.decreaseSpeed() - car.decreaseSpeed();
        System.out.println(getSpeed);
    }
}
