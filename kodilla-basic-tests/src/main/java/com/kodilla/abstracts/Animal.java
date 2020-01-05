package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOfLegs;

    public Animal(int numberOfLegs) {   //konstruktor
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {    //getter wydobywający wartość prywatnej zmiennej numberOfLegs
        return numberOfLegs;
    }

    public abstract void giveVoice (); //abstr. metoda, każda klasa dziedzicząca po Animal musi dodawać wlasną implementację
}
