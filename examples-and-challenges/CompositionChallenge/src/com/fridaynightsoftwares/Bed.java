package com.fridaynightsoftwares;

public class Bed {

    // Fields:
    private int sheets;
    private int pillows;
    private int mattresses;
    private int blankets;

    // Constructor:
    public Bed(int sheets, int pillows, int mattresses, int blankets) {
        this.sheets = sheets;
        this.pillows = pillows;
        this.mattresses = mattresses;
        this.blankets = blankets;
    }

    // Setters:
    public void setSheets(int sheets) {
        this.sheets = sheets;
    }
    public void setPillows(int pillows) {
        this.pillows = pillows;
    }
    public void setMattresses(int mattresses) {
        this.mattresses = mattresses;
    }
    public void setBlankets(int blankets) {
        this.blankets = blankets;
    }

    // Getters:
    public int getSheets() {
        return sheets;
    }
    public int getPillows() {
        return pillows;
    }
    public int getMattresses() {
        return mattresses;
    }
    public int getBlankets() {
        return blankets;
    }

    // Public methods:
    public void makeBed() {
        System.out.println("The bed has been made. Your sanity level went up.");
    }
}
