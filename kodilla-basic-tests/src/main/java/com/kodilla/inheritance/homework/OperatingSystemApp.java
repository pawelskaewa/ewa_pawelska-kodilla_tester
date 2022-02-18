package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem windowsXp = new OperatingSystem("Windows XP", 2001, 2014);
        windowsXp.turnOn();
        windowsXp.turnOff();
    }
}