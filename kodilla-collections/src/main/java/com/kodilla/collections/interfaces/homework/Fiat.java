package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {

    int speed;

    public Fiat(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
    }
}