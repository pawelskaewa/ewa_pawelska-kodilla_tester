package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Rhomb rhomb = new Rhomb();

        System.out.println(rectangle.area(3, 4 ,0));

        System.out.println(rectangle.perimeter(3, 4, 0));

        System.out.println(square.area(3, 100, 0));

        System.out.println(square.perimeter(3, 0, 0));

        System.out.println(rhomb.area(2, 3, 5));

        System.out.println(rhomb.perimeter(2, 3, 4));
    }
}