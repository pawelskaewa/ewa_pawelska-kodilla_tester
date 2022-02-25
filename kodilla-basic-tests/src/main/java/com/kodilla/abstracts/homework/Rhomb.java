package com.kodilla.abstracts.homework;

public class Rhomb extends Shape{
    int a;
    int h;

    public Rhomb(int a, int h){
        this.a = a;
        this.h = h;
    }
    @Override
    public int area() {
        return a * h;
    }

    @Override
    public int perimeter() {
        return 4 * a;
    }
}