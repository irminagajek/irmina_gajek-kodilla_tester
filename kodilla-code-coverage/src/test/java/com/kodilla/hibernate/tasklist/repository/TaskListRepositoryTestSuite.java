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
        //Given
        TaskList taskList = new TaskList("aaa", "bla");
        TaskList taskList1 = new TaskList("bbb", "agh");
        TaskList taskList2 = new TaskList("ccc", "fgh");
        TaskList taskList3 = new TaskList("ddd", "ret");

        //When
        taskListRepository.save(taskList);
        taskListRepository.save(taskList1);
        taskListRepository.save(taskList2);
        taskListRepository.save(taskList3);

        //Then
        String listName = taskList2.getListName();
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);
        Assert.assertEquals(readTaskList.get(0).getListName(), "ccc");

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
