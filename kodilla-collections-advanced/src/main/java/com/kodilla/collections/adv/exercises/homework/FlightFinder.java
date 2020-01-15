package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private static List<Flight> flights;

    public int findFlightsFrom(String departure) {
        flights = FlightRepository.getFlightsTable();
        List<Flight> flightsDeparture = new ArrayList<>();
        int fligSiz = flights.size();
        for (int i = 0; i < fligSiz; i++) {
        Flight flight = flights.get(i);
        if (flight.departure.equals(departure)) {
            flightsDeparture.add(flight);
        }
    }
        int depSize = flightsDeparture.size();
        return depSize;
    }

    public int findFlightsTo(String arrival) {
        flights = FlightRepository.getFlightsTable();
        List<Flight> flightsArrival = new ArrayList<>();
        int fligSiz = flights.size();
        for (int i = 0; i < fligSiz; i++) {
            Flight flight = flights.get(i);
            if (flight.arrival.equals(arrival)) {
                flightsArrival.add(flight);
            }
        }
        int arrSize = flightsArrival.size();
        return arrSize;
    }
}
