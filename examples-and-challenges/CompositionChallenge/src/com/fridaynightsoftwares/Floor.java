package com.fridaynightsoftwares;

public class Floor {

    // Fields:
    private double width;
    private double depth;
    private String material;
    private String color;

    // Constructor:
    public Floor(double width, double depth, String material, String color) {
        this.width = width;
        this.depth = depth;
        this.material = material;
        this.color = color;
    }

    // Getters:
    public double getWidth() {
        return width;
    }
    public double getDepth() {
        return depth;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }
}
