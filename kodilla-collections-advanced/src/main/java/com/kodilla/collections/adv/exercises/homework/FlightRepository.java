package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    static Map<String, String> flightsTable = new HashMap<>();

    public static void addFlights(String departure, String arrival){
        flightsTable.put(departure, arrival);
    }
}