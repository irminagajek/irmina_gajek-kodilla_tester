package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;
    private int increasedSpeed;
    private int decreasedSpeed;

    public Ford(int speed, int increasedSpeed, int decreasedSpeed) {
        this.speed = speed;
        this.increasedSpeed = increasedSpeed;
        this.decreasedSpeed = decreasedSpeed;
    }

    @Override
    public int getSpeed() {
        return speed + increaseSpeed() - decreaseSpeed();
    }

    @Override
    public int increaseSpeed() {
        return speed + 3 * increasedSpeed;
    }

    @Override
    public int decreaseSpeed() {
        return speed + 2 * decreasedSpeed;
    }
}
