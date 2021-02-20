package com.fridaynightsoftwares;

public class Car {

    // Field not initialized:
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Methods:
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("civic")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
}
