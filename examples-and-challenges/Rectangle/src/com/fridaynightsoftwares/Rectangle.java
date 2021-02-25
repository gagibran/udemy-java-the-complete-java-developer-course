package com.fridaynightsoftwares;

public class Rectangle {

    // Fields:
    private double width;
    private double length;

    // Constructor:
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }

    // Getters:
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    // General method:
    public double getArea() {
        return width * length;
    }
}
