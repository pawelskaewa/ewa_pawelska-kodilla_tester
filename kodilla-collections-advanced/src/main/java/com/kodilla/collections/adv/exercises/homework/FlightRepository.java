package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    static Map<String, List<String>> flightsTable = new HashMap<>();

    public static void addFlights(Flight flight) {
        Flight newFlight = new Flight(flight.getDeparture(), flight.getArrival());
        List<String> arrivalFlightsList = flightsTable.getOrDefault(flight.getDeparture(), new ArrayList<>());
        arrivalFlightsList.add(flight.getArrival());
        flightsTable.put(flight.getDeparture(), arrivalFlightsList);
        List<String> departureFlightsList = flightsTable.getOrDefault(flight.getArrival(), new ArrayList<>());
        departureFlightsList.add(flight.getDeparture());
        flightsTable.put(flight.getArrival(), departureFlightsList);
    }

//    public static List<Flight> getFlightsTable(Flight flight) {
//
//    }
}