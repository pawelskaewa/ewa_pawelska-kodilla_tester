package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int stampWidth;       //in mm
    private int stampLength;      //in mm
    private boolean stampMark;

    public Stamp(String stampName, int stampWidth, int stampLength, boolean stampMark) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
        this.stampMark = stampMark;
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

    public boolean isStampMark() {
        return stampMark;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                ", stampMark=" + stampMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWidth == stamp.stampWidth && stampLength == stamp.stampLength && stampMark == stamp.stampMark && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampLength, stampMark);
    }
}