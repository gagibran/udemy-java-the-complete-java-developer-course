package com.fridaynightsoftwares;

public class Door {

    // Fields:
    private double height;
    private double width;
    private double depth;
    private String material;
    private String color;


    // Constructor:
    public Door(double height, double width, double depth, String material, String color) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.material = material;
        this.color = color;
    }

    // Getters:
    public double getHeight() {
        return height;
    }
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
