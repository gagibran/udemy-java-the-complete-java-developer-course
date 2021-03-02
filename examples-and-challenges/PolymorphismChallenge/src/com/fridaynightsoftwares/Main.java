// We are going to go back to the car analogy.
// Create a base class called Car.
// It should have a few fields that would be appropriate for a generic car class
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters.
//
// Create some methods like startEngine, accelerate, and brake.
//
// Show a message for each in the base class.
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// Put all classes in the one java file (this one).

package com.fridaynightsoftwares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What car do you want to create (BMW, Mustang, Porsche)? ");
        String car = scanner.nextLine();
        System.out.print("How many cylinders? ");
        int cylinders = scanner.nextInt();
        scanner.nextLine();
        System.out.print("At what speed is the car moving? ");
        int speed = scanner.nextInt();
        Car selectedCar = selectCar(cylinders, car);
        selectedCar.startEngine();
        selectedCar.accelerate(speed);
        selectedCar.brake();
    }
    public static Car selectCar(int cylinders, String car) {
        switch (car.toLowerCase()) {
            case "bmw":
                return new Bmw(cylinders);
            case "mustang":
                return new Mustang(cylinders);
            case "porsche":
                return new Porsche(cylinders);
            default:
                System.out.println("Invalid car.");
                return null;
        }
    }
}

class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        wheels = 4;
        engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Engine is starting...");
    }

    public void accelerate(int speed) {
        System.out.println("The car is moving at " + speed + " km/h.");
    }

    public void brake() {
        System.out.println("The car has stopped.");
    }
}

class Bmw extends Car {
    public Bmw(int cylinders) {
        super("BMW", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine for the " + getName() + " is starting...");
        System.out.println("Its " + getCylinders() + " cylinders are coming in hot!");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("The " + getName() + " is moving at " + speed + " km/h.");
    }

    @Override
    public void brake() {
        System.out.println("The BMW has stopped.");
    }
}

class Mustang extends Car {
    public Mustang(int cylinders) {
        super("Mustang", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine for the " + getName() + " is starting...");
        System.out.println("Its " + getCylinders() + " cylinders are coming in hot!");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("The " + getName() + " is moving at " + speed + " km/h.");
    }

    @Override
    public void brake() {
        System.out.println("The Mustang has stopped.");
    }
}

class Porsche extends Car {
    public Porsche(int cylinders) {
        super("Mustang", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine for the " + getName() + " is starting...");
        System.out.println("Its " + getCylinders() + " cylinders are coming in hot!");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("The " + getName() + " is moving at " + speed + " km/h.");
    }

    @Override
    public void brake() {
        System.out.println("The Porsche has stopped.");
    }
}
