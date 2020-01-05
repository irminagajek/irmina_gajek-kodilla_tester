package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();                             //tablica losowa liczba samochodow od 1 do 15
        Car[] cars = new Car[random.nextInt(15) + 1];
        int i;
        for (i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarShape = random.nextInt(3);
        int increaseSpeed = random.nextInt(200);
        int getSpeed = random.nextInt(20);
        int decreaseSpeed = random.nextInt(10);

        if (drawnCarShape == 0)
            return new Opel(getSpeed, increaseSpeed, decreaseSpeed);
        else if (drawnCarShape == 1)
            return new Ford(getSpeed, increaseSpeed, decreaseSpeed);
        else if (drawnCarShape == 2)
            return new Skoda(getSpeed, increaseSpeed, decreaseSpeed);
        return null;
    }
}
