package com.fridaynightsoftwares;

public class Monitor {

    // Fields:
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; // Composition: the monitor HAS a resolution.

    // Constructor:
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    // Getters:
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getSize() {
        return size;
    }
    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    // Public method:
    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y);
    }
}
