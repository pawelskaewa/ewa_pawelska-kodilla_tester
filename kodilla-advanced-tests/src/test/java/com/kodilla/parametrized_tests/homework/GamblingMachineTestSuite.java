//package com.kodilla.parametrized_tests.homework;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class GamblingMachineTestSuite {
//
//    GamblingMachine gamblingMachine = new GamblingMachine();
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/luckyNumbers.csv")
//    public void testWithCorrectNumbers(Set<Integer> input) {
//        int result = 0;
//        try {
//            result = gamblingMachine.howManyWins(input);
//        } catch (InvalidNumbersException e) {
//            e.printStackTrace();
//        }
//        assertEquals(0, result);
//    }
//
////    @ParameterizedTest
////    @CsvFileSource(resources = "/wrongNumbers.csv")
////    public void testWithWrongNumbers (int input){
////        int result = 0;
////        try {
////            result = gamblingMachine.howManyWins(new HashSet<>(Arrays.asList(input)));
////        } catch (InvalidNumbersException e) {
////            e.printStackTrace();
////        }
////        Exception exception = assertThrows(NumberFormatException.class, () -> {
////            Integer.parseInt("1a");
////        });
////        String expectedMessage = "Wrong numbers provided";
////        String actualMessage = exception.getMessage();
////
////        assertTrue(actualMessage.contains(expectedMessage));
////    }
//}