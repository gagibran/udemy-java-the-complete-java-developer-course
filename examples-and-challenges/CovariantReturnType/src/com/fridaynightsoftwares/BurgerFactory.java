package com.fridaynightsoftwares;

public class BurgerFactory {

    // General method:
    public Burger createDefaultBurger() {
        return new Burger(true, 3, 2, false,
                true, true, true, 2, 2, false);
    }
}
