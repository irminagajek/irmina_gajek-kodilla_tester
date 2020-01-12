package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {

        Book book1 = BookManager.createBook("Harry Potter", "Joanne K. Rowling");
        Book book2 = BookManager.createBook("Institute", "Stephen King");
        Book book3 = BookManager.createBook("Knife", "Jo Nesbo");
        Book book4 = BookManager.createBook("Knife", "Jo Nesbo");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(book1 == book2);
        System.out.println(book1 == book3);
        System.out.println(book2 == book3);
        System.out.println(book3 == book4);
    }
}
