package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private static List<Flight> flights;

    public List<Flight> findFlightsFrom(String departure) {
        flights = FlightRepository.getFlightsTable();
        List<Flight> flightsDeparture = new ArrayList<>();
        int fligSiz = flights.size();
        for (int i = 0; i < fligSiz; i++) {
        Flight flight = flights.get(i);
        if (flight.departure.equals(departure)) {
            flightsDeparture.add(flight);
            }
        }
        if (flightsDeparture.size() == 0) {
            return flightsDeparture = null;
        }
        return flightsDeparture;
    }

    public List<Flight> findFlightsTo(String arrival) {
        flights = FlightRepository.getFlightsTable();
        List<Flight> flightsArrival = new ArrayList<>();
        int fligSiz = flights.size();
        for (int i = 0; i < fligSiz; i++) {
            Flight flight = flights.get(i);
            if (flight.arrival.equals(arrival)) {
                flightsArrival.add(flight);
            }
        }
        if (flightsArrival.size() == 0) {
            return flightsArrival = null;
        }
        return flightsArrival;
    }
}
