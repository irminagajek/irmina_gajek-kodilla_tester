package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookControllerMvcTestSuite {

    @Test
    public void shouldAddBook() {

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> myBooks = new ArrayList<>();
        BookDto book1 = new BookDto("a", "b");
        BookDto book2 = new BookDto("c", "d");
        BookDto book3 = new BookDto("e", "f");
        BookDto book4 = new BookDto("e", "f");
        myBooks.add(book1);
        myBooks.add(book2);
        myBooks.add(book3);

        //when

        Mockito.when(bookServiceMock.getBooks().add(book4)).thenReturn(myBooks.size());

        assertNotEquals(0, myBooks.size());
    }
}