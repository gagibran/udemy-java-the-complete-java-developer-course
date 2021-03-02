// The purpose of the application is to help a fictitious company called Bill's Burgers to manage
// their process of selling hamburgers.
//
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
//
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bill's store.
//
// The basic hamburger should have the following items.
//
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
//
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
//
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
//
// Create a Hamburger class to deal with all the above.
//
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
//
// Also create two extra varieties of Hamburgers (subclasses) to cater for:
//
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint: you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
//
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint: you have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//
// All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additions, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions).
//
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        // Normal burger:
        Hamburger hamburger = new Hamburger("Cheese burger", "Whole bread", "Fish", 2.55);
        hamburger.getAdditions();
        hamburger.addAddition("lettuce", 0.65);
        hamburger.addAddition("onion", 0.75);
        hamburger.addAddition("tomato", 0.25);
        System.out.println("Additions to the hamburger:");
        hamburger.getAdditions();
        System.out.println("The base price of your burger is " + hamburger.getPrice() + " USD.");
        System.out.println("The additional price of your burger is " + hamburger.getAdditionalPriceTotal() + " USD.");
        System.out.println("The total price of your burger is " + hamburger.getTotalPrice() + " USD.");
        System.out.println();

        // Healthy burger:
        HealthyBurger healthyBurger = new HealthyBurger("Healthy burger", "Bovine", 3.25);
        healthyBurger.getAdditions();
        healthyBurger.addAddition("lettuce", 0.65);
        healthyBurger.addAddition("onion", 0.75);
        healthyBurger.addAddition("tomato", 0.25);
        healthyBurger.addAddition("ricotta", 1.25);
        System.out.println("Additions to the hamburger:");
        healthyBurger.getAdditions();
        System.out.println("The base price of your burger is " + healthyBurger.getPrice() + " USD.");
        System.out.println("The additional price of your burger is " + healthyBurger.getAdditionalPriceTotal() + " USD.");
        System.out.println("The total price of your burger is " + healthyBurger.getTotalPrice() + " USD.");
        System.out.println();

        // Deluxe burger:
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe burger", "Italian bread", "Swine", 4.65);
        deluxeBurger.getAdditions();
        deluxeBurger.addAddition("lettuce", 0.65);
        deluxeBurger.addAddition("onion", 0.75);
        deluxeBurger.addAddition("carrot", 0.75);
        System.out.println("Additions to the hamburger:");
        deluxeBurger.getAdditions();
        System.out.println("The base price of your burger is " + deluxeBurger.getPrice() + " USD.");
        System.out.println("The additional price of your burger is " + deluxeBurger.getAdditionalPriceTotal() + " USD.");
        System.out.println("The total price of your burger is " + deluxeBurger.getTotalPrice() + " USD.");
    }
}
