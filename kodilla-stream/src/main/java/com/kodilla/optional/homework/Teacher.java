package com.kodilla.optional.homework;

import java.util.Optional;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public static Optional<String> getName() {
        return getName();
    }

    //public String getName() {
      //  return name;
    //}

    public static Teacher createTeacher(String name) {
        Teacher teacher = new Teacher(name);
        return teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
