package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    int a;
    int b;
    int h;

    public Rectangle(int sideA, int sideB, int height) {
        super(sideA, sideB, height);
        a = sideA;
        b = sideB;
        h = height;
    }

    public int getArea() {
        return a*b;
    }

    public int getPerimeter() {
        return 2*a+2*b;
    }
}
