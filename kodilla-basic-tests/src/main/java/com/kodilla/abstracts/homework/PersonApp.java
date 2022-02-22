package com.kodilla.abstracts.homework;

public class PersonApp {
    public static void main(String[] args) {
        new Person("Ania", 25, new Accountant(3000, "accounting"));
    }
}