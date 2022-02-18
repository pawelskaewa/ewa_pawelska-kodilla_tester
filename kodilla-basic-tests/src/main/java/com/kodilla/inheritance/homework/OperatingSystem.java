package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfRelease;
    private int yearOfClosing;
    private String operatingSystemName;

    public OperatingSystem(String operatingSystemName, int yearOfRelease, int yearOfClosing) {
        this.yearOfRelease = yearOfRelease;
        this.yearOfClosing = yearOfClosing;
        this.operatingSystemName = operatingSystemName;
    }

    public void turnOn() {
        System.out.println(operatingSystemName + " was released in " + yearOfRelease);
    }

    public void turnOff() {
        System.out.println(operatingSystemName + " was turned off in " + yearOfClosing);
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getYearOfClosing() {
        return yearOfClosing;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }
}