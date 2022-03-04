package com.kodilla.collections.adv.immutable.special.homework;

import static com.kodilla.collections.adv.immutable.special.homework.BookManager.books;

public class BookApplication {
    public static void main(String[] args) {
        Book dziady = BookManager.createBook("Dziady", "Adam Mickiewicz");
        Book potop = BookManager.createBook("Potop", "Henryk Sienkiewicz");
        Book ludzieBezdomni = BookManager.createBook("Ludzie bezdomni", "Stefan Zeromski");
        Book ludzieBezdomni2 = BookManager.createBook("Ludzie bezdomni", "Stefan Zeromski");

        books.add(dziady);
        books.add(potop);
        books.add(ludzieBezdomni);
        books.add(ludzieBezdomni2);

        System.out.println(ludzieBezdomni == ludzieBezdomni2);
        System.out.println(dziady == ludzieBezdomni);
        System.out.println(ludzieBezdomni.equals(ludzieBezdomni2));

        Book ludzieBezdomni3 = BookManager.createBook("Ludzie bezdomni", "Stefan Zeromski");

        System.out.println(ludzieBezdomni.equals(ludzieBezdomni3));

//        books.add(ludzieBezdomni3);
//
//        System.out.println(ludzieBezdomni == ludzieBezdomni3);
    }
}