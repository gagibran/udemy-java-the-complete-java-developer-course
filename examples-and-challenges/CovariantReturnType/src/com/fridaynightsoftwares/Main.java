package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        HealthyBurgerFactory healthyBurgerFactory = new HealthyBurgerFactory();
        Burger burger = burgerFactory.createDefaultBurger(); // createDefaultBurger() returns a Burger type.
        HealthyBurger healthyBurger = healthyBurgerFactory.createDefaultBurger(); // createDefaultBurger() returns a HealthyBurger type.
        System.out.println(burger.isWholeBread());
        System.out.println(healthyBurger.isWholeBread());
    }
}
