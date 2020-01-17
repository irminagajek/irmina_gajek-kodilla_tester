package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsToDUB() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("DUB");
        //then
        assertNotEquals(0, foundFlights.size());
        assertNotEquals(1, foundFlights.size());
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
    public void testFindFlightsFromWAW() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsFrom("WAW");
        //then
        assertNotEquals(0, foundFlights.size());
        assertNotEquals(1, foundFlights.size());
        for (Flight flight : foundFlights) {
        assertEquals("WAW", flight.departure);
        }
    }

    @Test
    public void testFindFlightsFromDUB() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsFrom("DUB");
        //then
        assertNotEquals(0, foundFlights.size());
        for (Flight flight : foundFlights) {
            assertEquals("DUB", flight.departure);
        }
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultsWhenArrivalAirportIsNull() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsTo(null).size());
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultsWhenDepartureAirportIsNull() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsFrom(null).size());
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenThereIsNoFlightToTheDestination() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsTo("HAM").size());
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenDepartureAirportNameIsWrong() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsFrom("WAWW").size());
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenArrivalIsEmptyString() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsTo(" ").size());
    }

    @Test
    public void testCheckIfFlightFinderShowsNoResultWhenDepartureIsEmptyString() {

        FlightFinder flight = new FlightFinder();
        assertEquals(0, flight.findFlightsFrom(" ").size());
    }
}
