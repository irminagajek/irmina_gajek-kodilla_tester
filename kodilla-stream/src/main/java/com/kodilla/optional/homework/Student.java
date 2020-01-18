package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    String name;
    Optional<Teacher> teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = Optional.ofNullable(teacher);
    }

    public Optional<Teacher> getTeacher() {

        return teacher;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
