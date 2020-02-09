package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    LocalTime start = LocalTime.of(6, 01);
    LocalTime end = LocalTime.of(19,59);

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        if (time.isAfter(start) && time.isBefore(end)) {
            return false;
        }
        return true;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
