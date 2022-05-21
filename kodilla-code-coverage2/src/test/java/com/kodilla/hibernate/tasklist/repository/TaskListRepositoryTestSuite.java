package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Things to do";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("To do list", DESCRIPTION);
        taskListRepository.save(taskList);
        String taskListName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(taskListName);

        //Then
        Assertions.assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
