package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootTest
class CarConfigurationTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
    CarConfiguration carConfiguration = (CarConfiguration) context.getBean(CarConfiguration.class);

    @Test
    public void ifWinterThenSUV() {
        String carType = carConfiguration.getCar().getCarType();
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void ifSummerThenCabrio() {
        carConfiguration.setChosenDate(LocalDate.of(2021,07,04));
        Car car = (Car)context.getBean("getCar");
        String carType = car.getCarType();
        Assertions.assertEquals("Cabrio", carType);
    }

    @Test
    public void ifSpringThenSedan() {
        carConfiguration.setChosenDate(LocalDate.of(2021,04,04));
        Car car = (Car)context.getBean("getCar");
        String carType = car.getCarType();
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void ifFallThenSedan() {
        carConfiguration.setChosenDate(LocalDate.of(2021,9,30));
        Car car = (Car)context.getBean("getCar");
        String carType = car.getCarType();
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void shouldHaveLightsTurnedOff() {
        Car car = (Car)context.getBean("getCar");
        car.setChosenTime(LocalTime.of(7,0));
        Assertions.assertEquals(false, car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldHaveLightsTurnedOn() {
        Car car = (Car)context.getBean("getCar");
        car.setChosenTime(LocalTime.of(5,0));
        Assertions.assertEquals(true, car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldHaveLightsTurnedOnAfterEightPM() {
        Car car = (Car)context.getBean("getCar");
        car.setChosenTime(LocalTime.of(22,0));
        Assertions.assertEquals(true, car.hasHeadlightsTurnedOn());
    }
}