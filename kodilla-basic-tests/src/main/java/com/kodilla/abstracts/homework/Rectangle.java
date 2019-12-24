package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB, sideB);
    }

    public int getArea() {
        return sideA * sideB;
    }

    public int getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }
}
