package com.fridaynightsoftwares;

public class Calculator {

    // Fields:
    private Floor floor;
    private Carpet carpet;

    // Constructor:

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // General method:
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
