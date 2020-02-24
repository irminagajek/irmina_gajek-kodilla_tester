package com.kodilla.soap.repository;

import com.kodilla.books.soap.Book;
import com.kodilla.books.soap.LiteraryGenre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {

        Book book1 = new Book();
        book1.setSignature("654");
        book1.setTitle("Knife");
        book1.setAuthor("Jo Nesbo");
        book1.setGenre(LiteraryGenre.CRIME);

        books.put(book1.getSignature(), book1);

        Book book2 = new Book();
        book2.setSignature("342");
        book2.setTitle("Preacher");
        book2.setAuthor("Camilla Lackberg");
        book2.setGenre(LiteraryGenre.CRIME);

        books.put(book2.getSignature(), book2);

        Book book3 = new Book();
        book3.setSignature("786");
        book3.setTitle("Instytut");
        book3.setAuthor("Stephen King");
        book3.setGenre(LiteraryGenre.SCI_FI);

        books.put(book3.getSignature(), book3);

        Book book4 = new Book();
        book4.setSignature("452");
        book4.setTitle("Wiedźmin");
        book4.setAuthor("Andrzej Sapkowski");
        book4.setGenre(LiteraryGenre.FANTASY);

        books.put(book4.getSignature(), book4);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the book's signature");
        return books.get(signature);
    }
}
