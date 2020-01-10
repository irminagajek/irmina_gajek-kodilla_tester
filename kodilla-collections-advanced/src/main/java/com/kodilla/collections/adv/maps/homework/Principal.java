package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String name;

    public Principal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                '}';
    }
}
