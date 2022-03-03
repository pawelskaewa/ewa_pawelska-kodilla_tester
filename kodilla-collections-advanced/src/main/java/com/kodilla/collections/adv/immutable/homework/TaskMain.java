package com.kodilla.collections.adv.immutable.homework;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Zmywanie naczyń", 10);
        System.out.println(task.title + " trwa " + task.getDuration() + " minut.");
    }
}