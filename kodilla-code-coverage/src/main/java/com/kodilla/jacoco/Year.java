package com.kodilla.jacoco;

public class Year {
    int yearInQuestion;

    public Year(int year) {
        this.yearInQuestion = year;
    }

    public boolean isLeap() {
        if (this.yearInQuestion % 4 == 0) {
            if (this.yearInQuestion % 100 == 0) {
                if (this.yearInQuestion % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}