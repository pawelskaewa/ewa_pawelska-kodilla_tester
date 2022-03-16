package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike Kowalski", new Teacher("Anne Novak")));
        students.add(new Student("Stephen Phoenix", new Teacher("Caroline Nicholson")));
        students.add(new Student("Barbara Eastwood", null));
        students.add(new Student("Chuck Rickman", null));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Teacher: " + student.getTeacher().orElse(new Teacher("<undefined>")).getName());
        }
    }
}