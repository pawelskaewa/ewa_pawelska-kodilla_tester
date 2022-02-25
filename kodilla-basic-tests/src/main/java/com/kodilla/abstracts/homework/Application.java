package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(8);
        Rhomb rhomb = new Rhomb(2, 3);

        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(rhomb.area());
        System.out.println(rhomb.perimeter());
    }
}