package com.fridaynightsoftwares;

public class Cylinder extends Circle {

    // Field:
    private double height;

    // Constructor:
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    // Getter:
    public double getHeight() {
        return height;
    }

    // General method:
    public double getVolume() {
        return getArea() * height;
    }
}
