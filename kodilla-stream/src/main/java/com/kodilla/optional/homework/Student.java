package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name, Teacher teacher) {
     Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
     Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
       this.name = name;
       this.teacher = teacherName;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher.getName() +
                '}';
    }
}
