package com.fridaynightsoftwares;

import javax.sound.midi.Soundbank;

public class Car  extends Vehicle {

    // Fields:
    private String licensePlate;
    private String carName;
    private String carManufacture;
    private String color;
    private boolean isAutomatic;

    // Constructor:
    public Car(int gears, String licensePlate,
               String carName, String carManufacture, String color, boolean isAutomatic, String fuel) {
        super(4, gears, true, "Medium", false, "Car", fuel);
        this.licensePlate = licensePlate;
        this.carName = carName;
        this.carManufacture = carManufacture;
        this.color = color;
        this.isAutomatic = isAutomatic;
        if (super.getGears() < 4) {
            System.out.println("Cars can only have from 4 to 7 gears. Assigning to 4 gears.");
            setGears(4);
        } else if (super.getGears() > 7) {
            System.out.println("Cars can only have from 4 to 7 gears. Assigning to 7 gears.");
            setGears(7);
        }
    }

    // Overloaded method:
    public void changeGears(String targetGear) {
        if (isAutomatic && targetGear.equals("auto")) {
            System.out.println("Gears are changing automatically now.");
            setCurrentGear(-1);
        } else {
            super.changeGears(Integer.parseInt(targetGear));
        }
    }

    // Overridden methods:
    @Override
    public void changeSpeed(double targetSpeed) {
        super.changeSpeed(targetSpeed);
        if (getSpeed() >= 0 && getSpeed() <= 15 && getCurrentGear() != 1) {
            changeGears(1);
        } else if (getSpeed() > 15 && getSpeed() <= 25 && getCurrentGear() != 2) {
            changeGears(2);
        } else if (getSpeed() > 25 && getSpeed() <= 45 && getCurrentGear() != 3) {
            changeGears(3);
        } else if (getSpeed() > 45 && getSpeed() <= 60 && getCurrentGear() != 4) {
            changeGears(4);
        } else if (getSpeed() > 60 && getSpeed() <= 100 && getCurrentGear() != 5 && getCurrentGear() != getGears()) {
            if (getGears() < 5) {
                changeGears(getGears());
            } else {
                changeGears(5);
            }
        } else if (getSpeed() > 100 && getSpeed() <= 110 && getCurrentGear() != 6 && getCurrentGear() != getGears()) {
            if (getGears() < 6) {
                changeGears(getGears());
            } else {
                changeGears(6);
            }
        } else if (getSpeed() > 110 && getCurrentGear() != 7 && getCurrentGear() != getGears()) {
            if (getGears() < 7) {
                changeGears(getGears());
            } else {
                changeGears(7);
            }
        }
    }
}
