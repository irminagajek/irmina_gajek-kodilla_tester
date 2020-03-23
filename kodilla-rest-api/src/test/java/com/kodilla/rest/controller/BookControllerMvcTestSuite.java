package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookControllerMvcTestSuite {

    @Test
    public void shouldAddBook() {

        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto book = new BookDto("Nóż", "Jo Nesbo");
        List<BookDto> myBooks = new ArrayList<>();
        myBooks.add(book);

        //when
        bookController.addBook(book);

        //then
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(book);
    }

    @Test
    public void isBookAdded() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> myBooks = new ArrayList<>();
        BookDto book1 = new BookDto("Nóż", "Jo Nesbo");
        myBooks.add(book1);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(myBooks);

        List<BookDto> result = bookController.getBooks();

        assertEquals(result.size(), myBooks.size());
    }
}