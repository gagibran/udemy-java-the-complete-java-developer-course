package com.fridaynightsoftwares;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String breadRollType, String meat, double price) {
        super(name, breadRollType, meat, price);
    }

    @Override
    public void addAddition(String additionName, double additionalPrice) {
        System.out.println("No extra additions can be added to the Deluxe Burger.");
    }

    @Override
    public void getAdditions() {
        System.out.println("Drink.");
        System.out.println("Chips.");
    }
}
