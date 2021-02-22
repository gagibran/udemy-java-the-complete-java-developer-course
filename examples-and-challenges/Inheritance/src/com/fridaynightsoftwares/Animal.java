package com.fridaynightsoftwares;

// Base class for animals:
public class Animal {

    // Fields:
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // Constructor:
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // Getters:
    public String getName() {
        return this.name;
    }
    public int getBrain() {
        return this.brain;
    }
    public int getBody() {
        return this.body;
    }
    public int getSize() {
        return this.size;
    }
    public int getWeight() {
        return this.weight;
    }

    // General functions:
    public void eat() {
        System.out.println("Begin ingestion...");
    }
    public void move(int speed) {
        System.out.println("This animal is moving at " + speed + " km/h.");
    }
}
