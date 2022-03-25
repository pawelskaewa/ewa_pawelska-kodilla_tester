package com.kodilla.collections.adv.exercises.homework;

import java.util.Collections;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.flightsTable;

public class FlightFinder {
    public List<String> findFlightsFrom(String departure) {
        return flightsTable.getOrDefault(departure, Collections.emptyList());
    }

//    public List<Flight> findFlightsTo(String arrival) {
//        return flightsTable.getOrDefault(newFlight, Collections.emptyList());
//    }
}