package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookManager {

    String author;
    String title;

    static  List<Book> books = new ArrayList<>();
    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }

    public static List<Book> showBooksList() {
        return books;
    }

    @Override
    public boolean equals(Object book) {
        if (this == book) return true;
        if (book == null || getClass() != book.getClass()) return false;
        BookManager that = (BookManager) book;
        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
