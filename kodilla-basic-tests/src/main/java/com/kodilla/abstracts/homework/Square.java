package com.kodilla.abstracts.homework;

public class Square extends Shape {
    int a;
    public Square(int sideA, int sideB, int height) {
        super(sideA, sideB, height);
        a = sideA;
    }

    public int getArea() {
        return a*a;
    }

    public int getPerimeter() {
        return 4*a;
    }
}
