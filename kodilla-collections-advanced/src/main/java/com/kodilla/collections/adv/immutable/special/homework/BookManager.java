package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book randomNewBook = new Book(title, author);
        books.add(randomNewBook);
        for (int n = 0; n < books.size(); n++)
            if (randomNewBook.equals(books.get(n)))
                return books.get(n);
            else
                return randomNewBook;
            return randomNewBook; // nie mam innego pomysłu, zastanawiam się, czy to kolejne return nie nadpisze return z pętli for, ale wolę wysłać i się dopytać czy to w ogóle ok niż się zastanawiać kolejne dni, a może dasz mi wskazówkę jeśli jest źle :D
    }
}