package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    Job job;
    int age;

    public Person(String firstName, Job job, int age ) {
        this.firstName = firstName;
        this.job = job;
        this.age = age;
    }

    public static void main(String[] args) {
        Dietician dietician = new Dietician();
    Person Janek = new Person("Janek", dietician, 36);
    System.out.println(Janek.firstName + " " + Janek.age + " " + Janek.job.getResponsibilities());
    }
}
