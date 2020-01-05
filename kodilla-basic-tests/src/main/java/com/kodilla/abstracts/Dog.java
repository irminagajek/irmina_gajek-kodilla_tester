package com.kodilla.abstracts;

public class Dog extends Animal {

    public Dog() { //podklasa musi wywołać metody z nadklasy
        super(4);
    }

    @Override
    public void giveVoice() { //szablon metody, ciało dodajemy wg uznania
    System.out.println("Hau hau");
    }
}
