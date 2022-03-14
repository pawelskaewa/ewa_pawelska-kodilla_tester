package com.kodilla.collections.adv.exercises.homework;

public class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}
//
//
//    Stwórz nowy pakietcom.kodilla.collections.adv.exercises.homework, a w nim:
//
//        Klasę Flight z polami String departure oraz String arrival.
//        Klasę FlightRepository z metodą statyczną getFlightsTable(), która zwraca listę lotów obsługiwanych
//        przez dane lotnisko (wypełnij tę listę przykładowymi lotami).
//
//        Klasę FlightFinder z metodami:
//
//public List<Flight> findFlightsFrom(String departure)
//public List<Flight> findFlightsTo(String arrival)
//
//        Metody te będą wyszukiwały loty do oraz z podanego miasta.
//
//        Napisz testy do klasy FlightFinder.