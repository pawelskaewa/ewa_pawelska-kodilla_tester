package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double orderValue;
    private LocalDate orderDate;
    private String login;

    public Order(double orderValue, LocalDate orderDate, String login) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getLogin() {
        return login;
    }
}




//    Utwórz podpakiet homework, a w nim klasę Order, która będzie przechowywać dane zamówienia: wartość zamówienia,
//    datę oraz login osoby dokonującej zamówienia. Następnie utwórz klasę Shop, która będzie przechowywać kolekcję
//    unikalnych zamówień.
//
//    Nowo utworzona klasa powinna mieć następujące funkcjonalności:
//
//    dodanie nowego zamówienia,
//    zwrócenie listy zamówień z zakresu dwóch dat,
//    pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
//    zwrócenie liczby zamówień,
//    zsumowanie wartości wszystkich zamówień.