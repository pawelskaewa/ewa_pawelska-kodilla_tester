package com.kodilla.inheritance.homework;

public class OperatingSystemSubClass1 extends OperatingSystem {

    public OperatingSystemSubClass1(String operatingSystemName, int yearOfRelease, int yearOfClosing) {
        super(operatingSystemName, yearOfRelease, yearOfClosing);
    }

    @Override
    public void turnOn() {
        System.out.println(getOperatingSystemName() + " was released in " + getYearOfRelease() + " year");
    }
}