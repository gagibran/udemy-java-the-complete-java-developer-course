package com.fridaynightsoftwares;

public class FlexCar extends Car {

    // Constructor:
    public FlexCar(int gears, String licensePlate,
                   String carName, String carManufacture,
                   String color, boolean isAutomatic) {
        super(gears, licensePlate, carName, carManufacture, color, isAutomatic, "Alcohol/Gasoline");
    }
}
