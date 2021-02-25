package com.fridaynightsoftwares;

public class Cuboid extends Rectangle {

    // Field:
    private double height;

    // Constructor:
    public Cuboid(double width, double length, double height) {
        super(width, length);
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
