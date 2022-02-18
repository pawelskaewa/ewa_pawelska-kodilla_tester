package com.kodilla.inheritance.homework;

public class OperatingSystemSubClass2 extends OperatingSystem {

    public OperatingSystemSubClass2(String operatingSystemName, int yearOfRelease, int yearOfClosing) {
        super(operatingSystemName, yearOfRelease, yearOfClosing);
    }

    @Override
    public void turnOff() {
        System.out.println(getOperatingSystemName() + " was turned off in " + getYearOfClosing() + " year");
    }
}