package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void getResponsibilities(){
        System.out.println(job.getResponsibilities());
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