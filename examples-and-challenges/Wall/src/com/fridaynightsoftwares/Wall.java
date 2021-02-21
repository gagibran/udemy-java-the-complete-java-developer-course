package com.fridaynightsoftwares;

public class Wall {

    // Fields:
    private double width;
    private double height;

    // Constructors:
    public Wall() {
    }
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0) {
            this.width = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
    }

    // Setters:
    public void setWidth(double width) {
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
    }
    public void setHeight(double height) {
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    // Getters:
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }

    // General methods:
    public double getArea() {
        return this.height * this.width;
    }
}
