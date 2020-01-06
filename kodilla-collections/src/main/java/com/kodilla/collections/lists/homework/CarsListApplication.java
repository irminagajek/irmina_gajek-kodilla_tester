package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Ford ford = new Ford(100,30,15);
        cars.add(ford);
        cars.add(new Opel(120, 20, 35));
        cars.add(new Skoda(150, 15, 5));

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("Rozmiar kolekcji wynosi: " + cars.size() + ".");
        }

        cars.remove(1);
        cars.remove(ford);

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("Rozmiar kolekcji wynosi: " + cars.size() + ".");
        }
    }
}
