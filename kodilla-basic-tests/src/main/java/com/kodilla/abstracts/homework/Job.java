package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String job;
    private String responsibilities;

    public Job(int salary, String job, String responsibilities) {
        this.salary = salary;
        this.job = job;
        this.responsibilities = responsibilities;
    }

    public abstract int getSalaryEffect();
    public abstract String getJobEffect();
    public abstract String getResponsibilitiesEffect();

    public int getSalary() {
        return salary;
    }

    public String getJob() {
        return job;
    }

    public String getResponsibilities() {
        return responsibilities;
    }


}
