package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {
        Person ania = new Person("Ania", 25, new Accountant(3000, "accounting"));

        System.out.println(ania.job.getResponsibilities() + " " + ania.firstName + " " + ania.age);
    }
}