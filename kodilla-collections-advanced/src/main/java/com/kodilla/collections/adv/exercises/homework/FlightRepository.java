package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

   static List<Flight> getFlightsTable(){
       List<Flight> flightsTable = new ArrayList<>();
       flightsTable.add(new Flight("Rome", "Los Angeles"));
       flightsTable.add(new Flight("Warsaw", "Los Angeles"));
       flightsTable.add(new Flight("Warsaw", "New York"));
       flightsTable.add(new Flight("Madrid", "Paris"));
       flightsTable.add(new Flight("Rome", "New York"));
       flightsTable.add(new Flight("Prague", "Warsaw"));
       return flightsTable;
   }
}