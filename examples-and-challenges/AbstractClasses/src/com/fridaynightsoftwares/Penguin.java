package com.fridaynightsoftwares;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly. Maybe swim instead?");
    }
}
