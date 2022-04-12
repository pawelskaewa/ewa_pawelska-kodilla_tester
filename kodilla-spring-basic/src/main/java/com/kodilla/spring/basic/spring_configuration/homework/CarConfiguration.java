package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
public class CarConfiguration {

    private LocalDate chosenDate = LocalDate.of(2022,01,01);

    public String getSeason() {
        int year = chosenDate.getYear();
        LocalDate springStart = LocalDate.of(year, 03, 21);
        LocalDate summerStart = LocalDate.of(year, 6, 22);
        LocalDate fallStart = LocalDate.of(year, 9, 23);
        LocalDate winterStart = LocalDate.of(year, 12, 22);
        LocalDate nextSpringStart = LocalDate.of(year + 1, 03, 21);
        if (chosenDate.isAfter(LocalDate.of(year, 1, 1)) && chosenDate.isBefore(springStart) || chosenDate.isEqual(LocalDate.of(year, 1, 1)))
            return "Winter";
        else if (chosenDate.isAfter(springStart) && chosenDate.isBefore(summerStart) || chosenDate.isEqual(springStart))
            return "Spring";
        else if (chosenDate.isAfter(summerStart) && chosenDate.isBefore(fallStart) || chosenDate.isEqual(summerStart))
            return "Summer";
        else if (chosenDate.isAfter(fallStart) && chosenDate.isBefore(winterStart) || chosenDate.isEqual(fallStart))
            return "Fall";
        else if (chosenDate.isAfter(fallStart) && chosenDate.isBefore(nextSpringStart) || chosenDate.isEqual(winterStart))
            return "Winter";
        return "Something went wrong";
    }

    @Bean
    @Scope("prototype")
    public Car getCar() {
        Car car;
        String season = getSeason();
        if (season == "Winter") {
            car = new SUV();
        } else if (season == "Summer") {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }

    public void setChosenDate(LocalDate chosenDate) {
        this.chosenDate = chosenDate;
    }
}