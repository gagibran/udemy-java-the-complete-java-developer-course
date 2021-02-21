package com.fridaynightsoftwares;

public class Point {

    // Fields:
    private int x; // Initialized with 0.
    private int y; // Initialized with 0.

    // Constructors:
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters:
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    // Setters:
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // General methods:
    public double distance() {
        return Math.sqrt(this.y * this.y + this.x * this.x);
    }
    public double distance(int x, int y) {
        int ySubtraction = this.y - y;
        int xSubtraction = this.x - x;
        return Math.sqrt(ySubtraction * ySubtraction + xSubtraction * xSubtraction);
    }
    public double distance(Point another) { // Takes in a "Point" object.
        int anotherX = another.getX();
        int anotherY = another.getY();
        int ySubtraction = this.y - anotherY;
        int xSubtraction = this.x - anotherX;
        return Math.sqrt(ySubtraction * ySubtraction + xSubtraction * xSubtraction);
    }
}
