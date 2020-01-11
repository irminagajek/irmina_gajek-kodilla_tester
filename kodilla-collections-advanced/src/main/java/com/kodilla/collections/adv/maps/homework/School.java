package com.kodilla.collections.adv.maps.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class School {
    public String name;

    List<Integer> schoolClasses = new ArrayList<>();

    public School(String schoolname, int[] students) {
        this.name = schoolname;

        for (int n = 0; n < students.length; n++) {
            schoolClasses.add(Array.getInt(students, n));
        }
    }

    public int getTotalStudents() {
            int sum = 0;
            for (int n = 0; n < schoolClasses.size(); n++) {
                sum = sum + schoolClasses.get(n);
            }
            return sum;
        }

    public String schoolName() {
        return this.name;
    }
}