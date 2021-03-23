package com.fridaynightsoftwares;

public abstract class Sport {
    private String name;
    private double points;

    public Sport(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
