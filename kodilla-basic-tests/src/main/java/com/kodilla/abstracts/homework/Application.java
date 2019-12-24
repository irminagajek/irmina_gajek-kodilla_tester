package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square(6, 6, 6);
        Shape rectangle = new Rectangle(6, 3);
        Shape parallelogram = new Parallelogram(8, 5, 4);

        Shape[] shapes = new Shape[]{square, rectangle, parallelogram};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
            System.out.println(shapes[i].getPerimeter());
        }
    }

}
