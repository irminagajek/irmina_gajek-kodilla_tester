package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsTo() {

        Flight flight = new Flight("Warsaw", "DUB");
        assertEquals("DUB", flight.getArrival());
    }

    @Test
    public void testFindFlightsFrom() {
        Flight flight = new Flight("WAW", "TXL");
        assertEquals("WAW", flight.getDeparture());
    }

    @Test
    public void testCheckIfFlightFinderShowsAllFlightsFromTheAirport() {

        FlightFinder flight = new FlightFinder();
        assertEquals(4, flight.findFlightsFrom("WAW"));
    }

    @Test
    public void testCheckIfFlightFinderShowsAllFlightsToTheAirport() {

        FlightFinder flight = new FlightFinder();
        assertEquals(1, flight.findFlightsTo("FCO"));
    }

    @Test
    public void testCheckIfThereIsNullWhenArrivalFieldIsEmpty() {

        Flight flight = new Flight("WAW", null);
        assertNull("this field is null", flight.getArrival());
    }

    @Test
    public void testCheckIfThereIsNullWhenDepartureFieldIsEmpty() {

        Flight flight = new Flight(null, "DUB");
        assertNull("this field is null", flight.getDeparture());
    }

    @Test
    public void testCheckIfThereIsNullWhenThereIsNoFlightToTheDestination() {

        Flight flight = new Flight("WAW", "SYD");
        assertNull("this fields is null", null);
    }

    @Test
    public void testCheckIfThereIsNullWhenTheAirportNameIsWrong() {

        Flight flight = new Flight("WAAW", "TXL");
        assertNull("this field is null", flight.getArrival());
    }
}
