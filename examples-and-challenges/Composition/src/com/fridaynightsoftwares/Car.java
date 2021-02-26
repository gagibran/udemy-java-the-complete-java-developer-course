package com.fridaynightsoftwares;

public class Car extends Vehicle {

    // Fields:
    private int doors;
    private int engineCapacity;

    // Constructors:
    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
