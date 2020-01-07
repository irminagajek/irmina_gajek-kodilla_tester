package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    String name;
    double length;
    double width;
    boolean isStamped;

    public Stamp(String name, double length, double width, boolean isStamped) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.isStamped = isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.length, length) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                isStamped == stamp.isStamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, width, isStamped);
    }

    @Override
    public String toString() {
        String isStampedValue;


        if (isStamped == true) {
            isStampedValue = "stamped";
        } else {
            isStampedValue = "unstamped";
        }
        return "Stamp{" +
                "name = '" + name + '\'' +
                ", length = " + length +
                ", width = " + width +
                ", isStamped = " + isStampedValue +
                '}';
    }
    }
