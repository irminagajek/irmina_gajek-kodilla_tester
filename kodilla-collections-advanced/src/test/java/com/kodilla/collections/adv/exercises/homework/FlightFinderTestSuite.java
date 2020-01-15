package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsToDUB() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("DUB");
        //then
        assertNotEquals(0, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("DUB", flight.arrival);
        }
    }

    @Test
    public void testFindFlightsToFCO() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("FCO");
        //then
        assertNotEquals(0, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("FCO", flight.arrival);
        }
    }

    @Test
    public void testFindFlightsToTXL() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("TXL");
        //then
        assertNotEquals(0, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("TXL", flight.arrival);
        }
    }

    @Test
    public void testFindFlightsToJFK() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("JFK");
        //then
        assertNotEquals(0, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("JFK", flight.arrival);
        }
    }

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsFrom("WAW");
        //then
        assertNotEquals(0, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("WAW", flight.departure);
        }
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultsWhenArrivalAirportIsNull() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsTo(null));
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultsWhenDepartureAirportIsNull() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsFrom(null));
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenThereIsNoFlightToTheDestination() {

        FlightFinder flight = new FlightFinder();
        assertEquals(null, flight.findFlightsTo("HAM"));
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenDepartureAirportNameIsWrong() {

        FlightFinder flight = new FlightFinder();
        assertEquals(null, flight.findFlightsFrom("WAWW"));
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenArrivalIsEmptyString() {

        FlightFinder flight = new FlightFinder();
        assertEquals(null, flight.findFlightsTo(" "));
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenDepartureIsEmptyString() {

        FlightFinder flight = new FlightFinder();
        assertEquals(null, flight.findFlightsFrom(" "));
    }
}
