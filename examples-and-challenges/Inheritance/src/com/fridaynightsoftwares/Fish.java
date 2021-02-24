package com.fridaynightsoftwares;

public class Fish  extends Animal {

    // Fields:
    private int fins;
    private int gills;
    private String scales;
    private int eyes;
    private int teeth;

    // Constructor with Animal constructor:
    public Fish(String name, int size, int weight, int fins, int gills, String scales, int eyes, int teeth) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.gills = gills;
        this.scales = scales;
        this.eyes = eyes;
        this.teeth = teeth;
    }

    // Generic methods:
    public void swim(int speed) {
        System.out.println(super.getName() + " has started swimming.");
        super.move(speed);
    }
    public void rest(int time) {
        System.out.println(super.getName() + " rests for " + time + " minutes.");
    }

    // Overridden methods:
    @Override
    public void eat() {
        super.eat();
        System.out.println("Nhac!");
    }
}
