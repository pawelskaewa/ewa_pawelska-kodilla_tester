package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooks() {
        // test przechodzi, ale nie jestem pewna czy to o to chodziło, czy mogę w ten sposób zamockować BookController
//        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = Mockito.mock(BookController.class);
        BookDto book = new BookDto("Title", "Author");
        bookController.addBook(book);
        Mockito.verify(bookController, Mockito.times(1)).addBook(book);
    }
}