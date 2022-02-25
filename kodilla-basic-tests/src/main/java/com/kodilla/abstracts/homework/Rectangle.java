package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public int area() {
        return a * b;
    }
}