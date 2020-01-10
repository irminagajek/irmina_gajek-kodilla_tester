package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> schoolDetails = new HashMap<>();
        Principal john = new Principal("John Black");
        Principal matthew = new Principal("Matthew Knight");
        Principal joanne = new Principal("Joanne Smith");

        School primary = new School();
        School secondary = new School();
        School highSchool = new School();

        schoolDetails.put(john, primary);
        schoolDetails.put(matthew, secondary);
        schoolDetails.put(joanne, highSchool);

    }
}
