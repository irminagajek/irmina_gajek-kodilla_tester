package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Ford ford = new Ford(3,0,0);
        cars.add(ford);

        cars.add(new Ford(1, 0, 0));
        cars.add(new Ford(2, 0, 0));

        cars.remove(1);
        cars.remove(ford);

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println(cars);
            System.out.println("Rozmiar kolekcji wynosi: " + cars.size() + ".");
        }
    }
}
