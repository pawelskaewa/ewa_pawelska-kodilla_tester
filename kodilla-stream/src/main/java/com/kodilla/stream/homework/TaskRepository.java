package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("washing dishes", LocalDate.of(2022, 03, 10), LocalDate.of(2022, 03, 15)));
        tasks.add(new Task("ironing", LocalDate.of(2022, 03, 12), LocalDate.of(2022, 03, 16)));
        tasks.add(new Task("doing homework", LocalDate.of(2022, 03, 10), LocalDate.of(2022, 03, 13)));
        tasks.add(new Task("ordering groceries", LocalDate.of(2022, 03, 11), LocalDate.of(2022, 03, 12)));
        tasks.add(new Task("folding clothes", LocalDate.of(2022, 03, 15), LocalDate.of(2022, 03, 16)));
        tasks.add(new Task("cleaning windows", LocalDate.of(2022, 03, 16), LocalDate.of(2022, 03, 20)));
        return tasks;
    }
}