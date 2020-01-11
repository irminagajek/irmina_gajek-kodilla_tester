package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> schoolDetails = new HashMap<>();
        Principal john = new Principal("John Black");
        Principal matthew = new Principal("Matthew Knight");
        Principal joanne = new Principal("Joanne Smith");

        School primary = new School(" Primary School, ", new int[]{35, 40, 20});
        School secondary = new School(" Secondary School, ", new int[]{26, 28});
        School highSchool = new School(" High School, ", new int[]{32, 31});

        schoolDetails.put(john, primary);
        schoolDetails.put(matthew, secondary);
        schoolDetails.put(joanne, highSchool);
        for (Map.Entry<Principal, School> schoolEntry : schoolDetails.entrySet()) {
            System.out.println(schoolEntry.getKey() + schoolEntry.getValue().schoolName() + "number of students: " + schoolEntry.getValue().getTotalStudents());
        }
    }
}
