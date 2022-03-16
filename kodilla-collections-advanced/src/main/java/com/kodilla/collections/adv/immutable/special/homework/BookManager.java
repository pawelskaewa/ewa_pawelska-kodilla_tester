package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book randomNewBook = new Book(title, author);

        if (books.size() == 0) {
            books.add(randomNewBook);
        }

        for (int n = 0; n < books.size(); n++)
            if (randomNewBook.equals(books.get(n))) {
                System.out.println("Jestem w ifie");
                return books.get(n);
            } else {
                books.add(randomNewBook);
                return randomNewBook;
            }
        System.out.println("Jestem poza ifem");
        return randomNewBook;
    }
}