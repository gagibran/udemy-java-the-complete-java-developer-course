package com.fridaynightsoftwares;

public class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        wheels = 4;
        engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " -> accelerate()");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + " -> brake()");
    }
}