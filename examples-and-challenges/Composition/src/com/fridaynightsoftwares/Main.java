package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {

        // Case composition:
        Case aCase = new Case("220B", "Dell", "240",
                                new Dimensions(20, 20, 5)); // We don't have to assign a class to a variable.

        // Monitor composition:
        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27,
                                    new Resolution(240, 1440));

        // Motherboard:
        Motherboard motherboard = new Motherboard("BJ-200", "Asus",
                                                4, 6, "v2.44");

        // Creating a PC:
        Computer computer = new Computer(aCase, monitor, motherboard);

        // Accessing the private methods of the compositions indirectly:
        computer.powerUp();
    }
}
