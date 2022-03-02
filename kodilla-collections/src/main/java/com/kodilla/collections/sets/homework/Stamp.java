package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int stampWidth;       //in mm
    private int stampLength;      //in mm
    private boolean isMarked;

    public Stamp(String stampName, int stampWidth, int stampLength, boolean isMarked) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
        this.isMarked = isMarked;
    }

    public String getStampName() {
        return stampName;
    }

    public int getStampWidth() {
        return stampWidth;
    }

    public int getStampLength() {
        return stampLength;
    }

    public boolean getIsMarked() {
        return isMarked;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                ", isMarked=" + isMarked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWidth == stamp.stampWidth && stampLength == stamp.stampLength && isMarked == stamp.isMarked && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampLength, isMarked);
    }
}