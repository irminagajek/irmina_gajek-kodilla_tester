package com.kodilla.abstracts.homework;

public class Fireman extends Job {
    int salary;
    String job;
    String responsibilities;

    public Fireman() {
        super(6000, "strażak", "gaszenie pożarów");
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

