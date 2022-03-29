package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();

        for(int i = 0; i < FlightRepository.getFlightsTable().size(); i++){
            if (FlightRepository.getFlightsTable().get(i).getDeparture() == departure){
                flightsFrom.add(FlightRepository.getFlightsTable().get(i));
            }
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTo = new ArrayList<>();

        for(int i = 0; i < FlightRepository.getFlightsTable().size(); i++){
            if (FlightRepository.getFlightsTable().get(i).getArrival() == arrival){
                flightsTo.add(FlightRepository.getFlightsTable().get(i));
            }
        }
        return flightsTo;
    }
}