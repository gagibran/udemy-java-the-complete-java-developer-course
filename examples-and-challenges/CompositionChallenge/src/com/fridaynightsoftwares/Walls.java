package com.fridaynightsoftwares;

public class Walls {

    // Fields:
    private double height;
    private String material;
    private String color;
    private String direction;

    // Constructor:
    public Walls(double height, String material, String color, String direction) {
        this.height = height;
        this.material = material;
        this.color = color;
        this.direction = direction;
    }

    // Getters:
    public double getHeight() {
        return height;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }
    public String getDirection() {
        return direction;
    }
}
