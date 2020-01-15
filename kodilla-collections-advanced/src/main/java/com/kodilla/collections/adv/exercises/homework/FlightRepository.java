package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    private static List<Flight> flights = new ArrayList<>();

    public static List<Flight> getFlightsTable() {flights = new ArrayList<>();
        Flight flight1 = new Flight("WAW", "DUB");
        Flight flight2 = new Flight("WAW", "FCO");
        Flight flight3 = new Flight("WAW", "TXL");
        Flight flight4 = new Flight("WAW", "JFK");

        flights.add(0, flight1);
        flights.add(1, flight2);
        flights.add(2, flight3);
        flights.add(3, flight4);

        return flights;
    }
}