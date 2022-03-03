package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();
        Principal kowalski = new Principal("Kamil", "Kowalski");
        Principal nowak = new Principal("Maciej", "Nowak");
        Principal kwiatkowska = new Principal("Anna", "Kwiatkowska");

        School kowalskiSchool = new School("Szkoła im. Marii Konopnickiej", 26, 30, 18);
        School nowakSchool = new School("Szkoła im. Fryderyka Chopina", 20, 25, 19, 24);
        School kwiatkowskaSchool = new School("Szkoła im. Juliusza Słowackiego", 31, 29, 30, 32, 28);

        schoolMap.put(kowalski, kowalskiSchool);
        schoolMap.put(nowak, nowakSchool);
        schoolMap.put(kwiatkowska, kwiatkowskaSchool);

        for (Map.Entry<Principal, School> schoolEntry : schoolMap.entrySet())
            System.out.println(schoolEntry.getKey().getFirstname() + " " + schoolEntry.getKey().getLastname() + ", " + schoolEntry.getValue().getSchoolName() + ", liczba uczniów: " +
                    schoolEntry.getValue().getSum());
    }
}