package com.kodilla.abstracts.homework;

public class Square extends Shape{
    @Override
    public int area(int a, int b, int h) {
        return a*a;
    }

    @Override
    public int perimeter(int a, int b, int h) {
        return 4*a;
    }
}