package com.kodilla.abstracts.homework;

public abstract class Shape {
    protected int sideA;
    protected int sideB;
    protected int height;

    public Shape (int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public abstract int getArea();
    public abstract int getPerimeter();

}

