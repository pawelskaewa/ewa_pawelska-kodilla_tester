package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Queen Elizabeth II", 20, 30, true));
        stamps.add(new Stamp("Fryderyk Chopin", 22, 28, false));
        stamps.add(new Stamp("Adam Mickiewicz", 25, 30, false));
        stamps.add(new Stamp("Queen Elizabeth II", 20, 30, true));
        stamps.add(new Stamp("Queen Elizabeth II", 20, 30, true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps){
            System.out.println(stamp);
        }
    }
}