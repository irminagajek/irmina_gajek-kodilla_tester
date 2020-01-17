package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Harry ", new Teacher ("Snape")));
        students.add(new Student("Hermiona ", Teacher.createTeacher("Dumbledore")));
        students.add(new Student("Malfoy ", Teacher.createTeacher("Sprout")));
        students.add(new Student("John ", null));
        students.add(new Student("Ron ", null));

        String name = Teacher.getName().orElse("<undefined>");

        for (Student student : students)
            System.out.println("student: " + student.getName() + "teacher: " + student.getTeacher().name);
    }
}
