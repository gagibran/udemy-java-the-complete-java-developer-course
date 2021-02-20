package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        Car porsche  = new Car();
        Car honda = new Car();
        porsche.setModel("Carrera");
        honda.setModel("Fit");
        System.out.println(porsche.getModel());
        System.out.println(honda.getModel());
    }
}
