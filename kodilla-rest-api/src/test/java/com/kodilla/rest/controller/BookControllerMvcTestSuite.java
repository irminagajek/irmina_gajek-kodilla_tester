package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookControllerMvcTestSuite {

    @Test
    public void shouldAddBook() {

        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> myBooks = new ArrayList<>();
        myBooks.add(new BookDto("Nóż", "Jo Nesbo"));
        myBooks.add(new BookDto("Policja", "Jo Nesbo"));
        myBooks.add(new BookDto("Pierwszy śnieg", "Jo Nesbo"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(myBooks);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertEquals(result.size(), myBooks.size());
        assertTrue(result.size() == 3);
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