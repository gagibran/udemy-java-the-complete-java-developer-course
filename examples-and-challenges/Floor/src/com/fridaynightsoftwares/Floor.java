package com.fridaynightsoftwares;

public class Floor {

    // Fields:
    private double width;
    private double length;

    // Constructor:
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }

    // General method:
    public double getArea() {
        return this.width * this.length;
    }
}
