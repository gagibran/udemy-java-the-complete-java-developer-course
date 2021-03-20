package com.fridaynightsoftwares;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The" + getName() + " bites.");
    }

    @Override
    public void breathe() {
        System.out.println("The" + getName() + " breathes.");
    }
}
