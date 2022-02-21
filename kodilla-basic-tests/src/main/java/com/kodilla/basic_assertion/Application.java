package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator2 = new Calculator();
        int subtractResult = calculator2.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator3 = new Calculator();
        int squaringResult = calculator3.squaring(a);
        boolean correct3 = ResultChecker.assertEquals(25, squaringResult);
        if (correct3) {
            System.out.println("Metoda podnoszenia do kwadratu działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda podnoszenia do kwadratu nie działa poprawnie dla liczby " + a);
        }
    }
}