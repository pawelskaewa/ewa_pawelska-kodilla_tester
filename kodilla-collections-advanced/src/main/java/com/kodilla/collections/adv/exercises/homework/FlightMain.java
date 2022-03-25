package com.kodilla.collections.adv.exercises.homework;

public class FlightMain {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Lisbon");
        Flight flight2 = new Flight("Warsaw", "Rome");
        Flight flight3 = new Flight("Rome", "Porto");
        Flight flight4 = new Flight("Rome", "Los Angeles");

        FlightRepository.addFlights(flight1);
        FlightRepository.addFlights(flight2);
        FlightRepository.addFlights(flight3);
        FlightRepository.addFlights(flight4);

        FlightFinder dfg = new FlightFinder();

        System.out.println(FlightRepository.flightsTable);
        System.out.println(dfg.findFlightsFrom("Rome"));
    }
}
