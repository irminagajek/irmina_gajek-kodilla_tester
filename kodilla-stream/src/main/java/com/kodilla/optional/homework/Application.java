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

        for (Student student : students){
            Teacher teacher = student.getTeacher().orElse(new Teacher("<undefined>"));
            System.out.println("student: " + student.getName() + "teacher: " + teacher.name);
        }
    }
}
