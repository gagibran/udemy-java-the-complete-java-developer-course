package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog luna = new Dog("Luna", 8, 20, "Short", 2, 4, 1, 32);
        luna.eat(); // Calling a method from the Animals class.
        luna.walk();
        Fish shark = new Fish("Shark", 10, 30, 10, 4, "Sharp", 2, 40);
        shark.swim(40);
        shark.eat();
    }
}
