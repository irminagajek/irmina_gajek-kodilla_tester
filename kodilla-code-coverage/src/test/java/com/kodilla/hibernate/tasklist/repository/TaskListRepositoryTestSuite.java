package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {

        String listName = "ToDo";
        String listName2 = "Done";
        String listName3 = "NextMonth";
        String listName4 = "In progess";

        //Given
        TaskList taskList = new TaskList(listName, "Tasks to do");
        TaskList taskList1 = new TaskList(listName2, "Tasks done");
        TaskList taskList2 = new TaskList(listName3, "Tasks not urgent");
        TaskList taskList3 = new TaskList(listName4, "Tasks in progress");

        //When
        taskListRepository.save(taskList);
        taskListRepository.save(taskList1);
        taskListRepository.save(taskList2);
        taskListRepository.save(taskList3);

        //Then
        String listNames = taskList.getListName();
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);
        Assert.assertEquals(readTaskList.get(0).getListName(), listName);

        //CleanUp
        taskListRepository.deleteAll();
    }
}