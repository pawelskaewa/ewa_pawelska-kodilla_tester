//package com.kodilla.collections.adv.exercises.homework;
//
//import java.util.Collections;
//import java.util.List;
//
//public class FlightFinder {
//    public List<Flight> findFlightsFrom(String departure) {
//        return FlightRepository.flightsTable.getOrDefault(departure, Collections.emptyList());
//    }
//
//    public List<Flight> findFlightsTo(String arrival) {
//        return FlightRepository.flightsTable.getOrDefault(arrival, Collections.emptyList());
//    }
//}