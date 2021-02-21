package com.fridaynightsoftwares;

public class Carpet {

    // Field:
    private double cost;

    // Constructors:
    public Carpet(double cost) {
        this.cost = cost;
        if (cost < 0) {
            this.cost = 0;
        }
    }

    // Getter:
    public double getCost() {
        return this.cost;
    }
}
