package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {

       Windows7 windows7 = new Windows7(2009);
       windows7.turnOnSystem();
       windows7.turnOffSystem();

       Windows10 windows10 = new Windows10(2015);
       windows10.turnOnSystem();
       windows10.turnOffSystem();
    }
}

