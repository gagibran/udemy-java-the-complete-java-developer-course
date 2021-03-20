package com.fridaynightsoftwares;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(getName() + " flaps its wings.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathes with its tiny lungs.");
    }
}
