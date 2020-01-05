package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;
    private int increasedSpeed;
    private int decreasedSpeed;

    public Opel(int speed, int increasedSpeed, int decreasedSpeed) {
        this.speed = speed;
        this.increasedSpeed= increasedSpeed;
        this.decreasedSpeed = decreasedSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return increasedSpeed;
    }

    @Override
    public int decreaseSpeed() {
        return decreasedSpeed ;
    }
}
