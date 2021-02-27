package com.fridaynightsoftwares;

public class Wardrobe {

    // Fields:
    private int shirts;
    private int shorts;
    private int pants;
    private int belts;
    private int underwear;
    private int dresses;
    private int socks;
    private int shoes;
    private int flipFlop;

    // Constructor:
    public Wardrobe(int shirts, int shorts, int pants, int belts, int underwear, int dresses, int socks, int shoes) {
        this.shirts = shirts;
        this.shorts = shorts;
        this.pants = pants;
        this.belts = belts;
        this.underwear = underwear;
        this.dresses = dresses;
        this.socks = socks;
        this.shoes = shoes;
    }

    // Private getters:
    private int getShirts() {
        return shirts;
    }
    private int getShorts() {
        return shorts;
    }
    private int getPants() {
        return pants;
    }
    private int getBelts() {
        return belts;
    }
    private int getUnderwear() {
        return underwear;
    }
    private int getDresses() {
        return dresses;
    }
    private int getSocks() {
        return socks;
    }
    private int getShoes() {
        return shoes;
    }
    private int getFlipFlop() {
        return flipFlop;
    }
}
