package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square(6, 6,6);
        System.out.println("Pole kwadratu wynosi " + square.getArea());
        System.out.println("Obwód kwadratu wynosi " + square.getPerimeter());

        Shape rectangle = new Rectangle(6, 3, 3);
        System.out.println("Pole prostokąta wynosi " + rectangle.getArea());
        System.out.println("Obwód prostokąta wynosi " + rectangle.getPerimeter());

        Shape parallelogram = new Parallelogram(8,5,4);
        System.out.println("Pole równoległoboku wynosi " + parallelogram.getArea());
        System.out.println("Obwód rownoległoboku wynosi " + parallelogram.getPerimeter());
    }

}
