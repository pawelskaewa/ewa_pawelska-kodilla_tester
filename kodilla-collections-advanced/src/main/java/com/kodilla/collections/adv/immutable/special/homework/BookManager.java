package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book randomNewBook = new Book(title, author);
        for (int n = 0; n < books.size(); n++)
            if (randomNewBook.equals(books.get(n)))
                return books.get(n);
            else
                return randomNewBook;
            return randomNewBook;
    }
}