package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

    Set<Stamp> stamps = new HashSet<>();
    stamps.add(new Stamp("green", 2.0,2.0, true));
    stamps.add(new Stamp("red", 2.2, 1.6, false));
    stamps.add(new Stamp("yellow", 1.5, 2.0, false));
    stamps.add(new Stamp("blue", 3.0, 3.5, true));
    stamps.add(new Stamp("red", 2.2, 1.6, false));

    System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
