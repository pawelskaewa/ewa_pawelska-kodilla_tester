package com.kodilla.collections.adv.exercises.homework;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.flightsTable;

public class FlightMain {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Lisbon");
        Flight flight2 = new Flight("Warsaw", "Vienna");
        Flight flight3 = new Flight("Rome", "Porto");
        Flight flight4 = new Flight("Rome", "Los Angeles");

        flightsTable.put(flight1.getDeparture(), flight1.getArrival());
        flightsTable.put(flight2.getDeparture(), flight2.getArrival());
        flightsTable.put(flight3.getDeparture(), flight3.getArrival());
        flightsTable.put(flight4.getDeparture(), flight4.getArrival());
    }
}
