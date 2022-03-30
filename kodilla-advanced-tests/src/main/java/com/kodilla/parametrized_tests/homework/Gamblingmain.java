package com.kodilla.parametrized_tests.homework;

import java.util.Arrays;
import java.util.HashSet;

public class Gamblingmain {
    public static void main(String[] args) {
        GamblingMachine gamblingMachine = new GamblingMachine();

        int result = 52;
        try {
            result = gamblingMachine.howManyWins(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
            System.out.println(result);
        } catch (InvalidNumbersException e) {
            e.printStackTrace();
        }
    }
}