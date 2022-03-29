package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void shouldReturnTheCorrectNumberOfAirportsTo() {
        assertEquals (2, flightFinder.findFlightsFrom("Warsaw").size());
    }

    @Test
    public void shouldReturnTheCorrectNumberOfAirportsFrom() {
        assertEquals (1, flightFinder.findFlightsTo("Warsaw").size());
    }

    @Test
    public void shouldReturnZeroWhenAirportDoesNotExist() {
        assertEquals (0, flightFinder.findFlightsTo("Gdansk").size());
    }

    @Test
    public void shouldReturnZeroWhenThereAreNoFlightsFrom() {
        assertEquals (0, flightFinder.findFlightsFrom("Los Angeles").size());
    }

    @Test
    public void shouldReturnZeroWhenThereAreNoFlightsTo() {
        assertEquals (0, flightFinder.findFlightsTo("Rome").size());
    }

    @Test
    public void shouldReturnCorrectNameOfTheAirportTo() {
        assertEquals ("Paris", flightFinder.findFlightsFrom("Madrid").get(0).getArrival());
    }

    @Test
    public void shouldReturnCorrectNameOfTheAirportFrom() {
        assertEquals ("Prague", flightFinder.findFlightsTo("Warsaw").get(0).getDeparture());
    }
}