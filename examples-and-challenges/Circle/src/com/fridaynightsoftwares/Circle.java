package com.fridaynightsoftwares;

public class Circle {

    // Field:
    private double radius;

    // Constructor:
    public Circle(double radius) {
        this.radius = radius;
        if (radius < 0) {
            this.radius = 0;
        }
    }

    // Getter:
    public double getRadius() {
        return radius;
    }

    // General method:
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
