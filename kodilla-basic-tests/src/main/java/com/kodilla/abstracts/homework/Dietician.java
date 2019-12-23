package com.kodilla.abstracts.homework;

public class Dietician extends Job {
    int salary;
    String job;
    String responsibilities;

    public Dietician() {
        super(4000, "dietetyk", "układanie planów żywnościowych");
    }

    @Override
    public int getSalaryEffect() {
        return salary;
    }

    @Override
    public String getJobEffect() {
        return job;
    }

    @Override
    public String getResponsibilitiesEffect() {
        return responsibilities;
    }
}

