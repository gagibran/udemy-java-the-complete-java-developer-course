package com.fridaynightsoftwares;

public class HealthyBurgerFactory extends BurgerFactory {

    // Overridden method with covariant return type. Event though the super.createDefaultBurger() method has a return
    // type of Burger, overridden classes can have a return type that's from a sub class of the return type.
    // That's why we can return a HealthyBurger, because its a child from Burger.
    @Override
    public HealthyBurger createDefaultBurger() {
        return new HealthyBurger();
    }
}
