package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    int age;
    static String job;

    public void Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

//    public static Accountant getJob() {
//        if (job.equals("Accountant")) {
//            return Accountant(salary, responsibilities);
//        } else if (job.equals("Cashier")) {
//            return new Cashier();
//        } else if (job.equals("Teacher")) {
//            return new Teacher();
//        }
//        return null;
//    }
}