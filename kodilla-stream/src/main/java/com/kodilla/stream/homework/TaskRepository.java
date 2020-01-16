package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("zadanie1", LocalDate.of(2019, 12, 7), LocalDate.of(2020, 1, 10)));
        tasks.add(new Task("zadanie2", LocalDate.of(2019, 12, 15), LocalDate.of(2020, 1, 15)));
        tasks.add(new Task("zadanie3", LocalDate.of(2020, 1, 10), LocalDate.of(2020, 3, 31)));
        tasks.add(new Task("zadanie3", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 2, 28)));

        return tasks;
    }


}
