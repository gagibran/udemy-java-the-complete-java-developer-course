package com.fridaynightsoftwares;

public class Computer {

    // Fields:
    private Case oneCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Constructor:
    public Computer(Case oneCase, Monitor monitor, Motherboard motherboard) {
        this.oneCase = oneCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Private getters:
    public Case getOneCase() {
        return oneCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }

    // Private methods:
    private void drawLogo() {
        System.out.println(motherboard.getManufacturer() + ". Loading...");
    }

    // Public method:
    public void powerUp() {
        oneCase.pressPowerButton();
        drawLogo();
    }
}
