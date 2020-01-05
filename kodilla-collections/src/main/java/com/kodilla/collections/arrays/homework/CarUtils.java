package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("--------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Car increased speed: " + car.increaseSpeed());
        System.out.println("Car decreased speed: " + car.decreaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown car name";
    }
}
