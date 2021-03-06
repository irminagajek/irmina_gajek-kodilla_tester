package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean isCorrect = ResultChecker.assertEquals(-3, subtractResult);
        if (isCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squaringResult = calculator.squaring(a);
        boolean isItCorrect = ResultChecker.assertEquals(25, squaringResult);
        if (isItCorrect) {
            System.out.println("Metoda squaring działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczby " + a);
        }
    }
}