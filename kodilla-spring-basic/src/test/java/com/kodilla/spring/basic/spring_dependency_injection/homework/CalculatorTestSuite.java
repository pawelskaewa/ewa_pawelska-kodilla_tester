package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldAddTwoNumbersCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(2, 4);
        assertEquals(6, result);
    }

    @Test
    public void shouldSubtractTwoNumbersCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(2, 4);
        assertEquals(-2, result);
    }

    @Test
    public void shouldMultiplyTwoNumbersCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(2, 4);
        assertEquals(8, result);
    }

    @Test
    public void shouldDivideTwoNumbersCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(2, 4);
        assertEquals(0.5, result, 0.01);
    }
}