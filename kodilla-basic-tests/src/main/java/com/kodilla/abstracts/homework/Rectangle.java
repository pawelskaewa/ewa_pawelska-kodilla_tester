package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    @Override
    public int perimeter(int a, int b, int h) {
        return 2 * a + 2 * b;
    }

    @Override
    public int area(int a, int b, int h) {
        return a * b;
    }
}
