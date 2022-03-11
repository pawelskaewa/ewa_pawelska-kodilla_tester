package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book dziady = BookManager.createBook("Dziady", "Adam Mickiewicz");
        Book ludzieBezdomni = BookManager.createBook("Ludzie bezdomni", "Stefan Zeromski");
        Book ludzieBezdomni2 = BookManager.createBook("Ludzie bezdomni", "Stefan Zeromski");

        System.out.println(ludzieBezdomni == ludzieBezdomni2);
        System.out.println(dziady == ludzieBezdomni);
        System.out.println(ludzieBezdomni.equals(ludzieBezdomni2));

        System.out.println(BookManager.createBook("Ludzie bezdomni", "Stefan Zeromski"));
        System.out.println(ludzieBezdomni == BookManager.createBook("Ludzie bezdomni", "Stefan Zeromski"));
    }
}