package com.kodilla.abstracts.homework;

public abstract class Job {
    protected int salary;
    protected String job;
    protected String responsibilities;

    public Job(int salary, String job, String responsibilities) {
        this.salary = salary;
        this.job = job;
        this.responsibilities = responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    @Override
    public String toString() {
        return "Job" +
                "salary:" + salary +
                "job:" + job +
                "reponsibilities:" + responsibilities;
    }
}
