package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    String job;
    int age;

    public Person(String firstName, String job, int age ) {
        this.firstName = firstName;
        this.job = job;
        this.age= age;
    }

    public static void main(String[] args) {
        Dietician dietician = new Dietician();
    Person Janek = new Person("Janek", "dietetyk ", 36);
    System.out.println(Janek.firstName + " " + Janek.age + " " + Janek.job + dietician.getResponsibilities());
    }
}
