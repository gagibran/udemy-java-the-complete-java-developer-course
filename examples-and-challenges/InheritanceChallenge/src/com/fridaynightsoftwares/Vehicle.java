package com.fridaynightsoftwares;

public class Vehicle {

    // Fields:
    private double speed;
    private int wheels;
    private int gears;
    private boolean hasLicense;
    private String size;
    private boolean isPublicVehicle;
    private String name;
    private int currentGear = 1;
    private String fuel;
    private double currentSteerDegrees = 0;

    // Constructor:
    public Vehicle(int wheels, int gears,
                   boolean hasLicense, String size, boolean isPublicVehicle,
                   String name, String fuel) {
        this.speed = 0;
        this.wheels = wheels;
        this.gears = gears;
        this.hasLicense = hasLicense;
        this.size = size;
        this.isPublicVehicle = isPublicVehicle;
        this.name = name;
        this.fuel = fuel;
    }

    // Getters:
    public double getSpeed() {
        return speed;
    }
    public int getWheels() {
        return wheels;
    }
    public int getGears() {
        return gears;
    }
    public boolean hasLicense() {
        return hasLicense;
    }
    public String getSize() {
        return size;
    }
    public boolean isPublicVehicle() {
        return isPublicVehicle;
    }
    public String getName() {
        return name;
    }
    public int getCurrentGear() {
        return currentGear;
    }
    public String getFuel() {
        return fuel;
    }
    public double getCurrentSteerDegrees() {
        return currentSteerDegrees;
    }

    // Setters:
    public void setGears(int gears) {
        this.gears = gears;
    }
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    // General methods:
    public void changeGears(int targetGear) {
        if (gears <= 0) {
            System.out.println("This vehicle has no gears.");
        } else if (targetGear <= 0) {
            System.out.println("There's no 0 or negative gear, silly!");
        } else if (targetGear > gears) {
            System.out.println("This vehicle has only " + gears + " gears.");
        } else if (targetGear == currentGear) {
            System.out.println("You already are on gear " + targetGear);
        } else if (currentGear == -1) {
            System.out.println("Changing from automatic to gear " + targetGear);
            currentGear = targetGear;
        } else {
            System.out.println("Changing from gear " + currentGear + " to gear " + targetGear + ".");
            currentGear = targetGear;
        }
    }
    public void changeSpeed(double targetSpeed) {
        if (targetSpeed < 0) {
            System.out.println("There's no negative speeds!");
        } else {
            System.out.println("Changing speed to " + targetSpeed + " km/h.");
            speed = targetSpeed;
        }
    }
    public void steer(double targetDirection) {
        if (targetDirection == currentSteerDegrees) {
            System.out.println("Vehicle already in this position.");
        } else {
            System.out.println("Steering the vehicle " + targetDirection + " degrees.");
            currentSteerDegrees = targetDirection;
        }
    }
}
