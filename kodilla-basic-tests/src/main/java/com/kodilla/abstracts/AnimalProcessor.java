package com.kodilla.abstracts;

public class AnimalProcessor {

    public void process(Animal animal) { //metoda ma zostać wywołana z każdego obiektu, który jest podtypem Animal
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");
        animal.giveVoice();
    }

    }

