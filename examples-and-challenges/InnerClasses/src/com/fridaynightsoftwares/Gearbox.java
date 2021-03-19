package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean isClutchIn;

    public Gearbox(int maxGears) {
        gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        gears.add(neutral);
        for (int i = 1; i <= this.maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean isClutchIn) {
        this.isClutchIn = isClutchIn;
    }
    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            gears.add(new Gear(number, ratio));
        }
    }
    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < gears.size() && isClutchIn) {
            currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            currentGear = 0;
        }
    }
    public double wheelSpeed(int revs) {
        if (isClutchIn) {
            System.out.println("Scream!");
            return 0;
        }
        return revs * gears.get(currentGear).getRatio();
    }
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double driveSpeed(int revs) {
            return revs * ratio;
        }
        public double getRatio() {
            return ratio;
        }
    }
}
