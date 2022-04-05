package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/luckyNumbers.csv")
    public void testWithCorrectNumbers(int input1, int input2, int input3, int input4, int input5, int input6) throws InvalidNumbersException {
        int result = 0;
        try {
            result = gamblingMachine.howManyWins(new HashSet<>(Arrays.asList(input1, input2, input3, input4, input5, input6)));
        } catch (InvalidNumbersException e) {
            e.printStackTrace();
        }
        assertEquals(0, result, 6);
    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "/luckyNumbers.csv")
//    public void testWithCorrectNumbersVersion2 (String numbers) throws InvalidNumbersException {
//        String[] splittedNumbers = numbers.split(",");
//        int[] intNumbers = new int[6];
//
//        for(int i = 0; i < 6; i++) {
//            intNumbers[i] = Integer.valueOf(splittedNumbers[i]);
//        }
//        int result = 0;
//        try {
//            result = gamblingMachine.howManyWins(intNumbers);
//        } catch (InvalidNumbersException e) {
//            e.printStackTrace();
//        }
//        assertEquals(0, result, 6);
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv")
    void expectedException(int input1, int input2, int input3, int input4, int input5, int input6) throws InvalidNumbersException {
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(new HashSet<>(Arrays.asList(input1, input2, input3, input4, input5, input6)));
        }, "InvalidNumbersException should have been thrown, but it didn't happen");
    }

    @Test
    void expectedExceptionWhenLessThanSixNumbersAreGiven() throws InvalidNumbersException {
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(new HashSet<>(Arrays.asList(2, 3)));
        }, "InvalidNumbersException should have been thrown, but it didn't happen");
    }


    @Test
    void expectedExceptionWhenNegativeNumberIsGiven() throws InvalidNumbersException {
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(new HashSet<>(Arrays.asList(-1, 2, 3, 4, 5, 6)));
        }, "InvalidNumbersException should have been thrown, but it didn't happen");
    }
}