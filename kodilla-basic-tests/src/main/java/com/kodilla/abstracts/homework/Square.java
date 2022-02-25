package com.kodilla.abstracts.homework;

public class Square extends Shape{

    int a;
public Square(int a){
    this.a = a;
}
    @Override
    public int area() {
        return a*a;
    }

    @Override
    public int perimeter() {
        return 4*a;
    }
}