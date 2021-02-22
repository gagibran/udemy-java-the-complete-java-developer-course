package com.fridaynightsoftwares;

public class Dog extends Animal {

    // Fields:
    private String fur;
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;

    // Constructor with constructor from super class:
    public Dog(String name, int size, int weight, String fur, int eyes, int legs, int tail, int teeth) {
        super(name, 1, 1, size, weight); // All dogs have one brain and one body.
        this.fur = fur;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    // General methods:
    public void walk() {
        System.out.println(super.getName() + " went for a walk!");
        super.move(10);
    }

    // Overridden methods:
    @Override
    public void eat() {
        super.eat();
        System.out.println("Chomp, chomp");
    }
}
