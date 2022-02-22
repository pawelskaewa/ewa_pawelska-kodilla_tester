package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator2 = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator2.subtract(a, b);
        assertEquals(-3, subtractResult);
    }
    @Test
    public void testSquarePositiveNumber() {
        Calculator calculator3 = new Calculator();
        int a = 5;
        int squaringResult = (int) calculator3.squaring(a);
        assertEquals(25, squaringResult);
        assertEquals(0, 0, 0.01);
    }

    @Test
    public void testSquareNegativeNumber() {
        Calculator calculator4 = new Calculator();
        int a = -5;
        int squaringResult2 = (int) calculator4.squaring(a);
        assertEquals(25, squaringResult2);
        assertEquals(0, 0, 0.01);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator5 = new Calculator();
        int a = 0;
        int squaringResult3 = (int) calculator5.squaring(a);
        assertEquals(0, squaringResult3);
        assertEquals(0, 0, 0.01);
    }
}