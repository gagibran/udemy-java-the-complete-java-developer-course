package com.fridaynightsoftware;

public class Main {

    public static void main(String[] args) {

        // If-then:
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        if (!isAlien) { // Also works.
            System.out.println("It is not an alien!");
        }

        if (!isAlien)
            System.out.println("It is not an alien!"); // This works, but it's not good practice.

        if (!isAlien)
            System.out.println("It is not an alien!"); // This works, but it's not good practice.
        System.out.println("I'm scared!"); // This will get executed, no matter the outcome of the if-statement.

        if (!isAlien && 100 > 40) { // A and B are true.
            System.out.println("It is not an alien!");
        }

        if (isAlien || 100 > 40) { // At least B is true.
            System.out.println("It is not an alien!");
        }

        // Mixing both:
        if ((isAlien || 100 > 40) && (!isAlien || 100 <= 40)) { // B and C are true.
            System.out.println("It is not an alien!"); // Condition is met.
        }


        // Ternary operator:
        boolean isCar = false;
        boolean wasCar = isCar ? true : false; // wasCar will be false.
        boolean wasTruck = !isCar ? true : false; // wasTruck will be true.
        System.out.println(wasCar);
        System.out.println(wasTruck);
    }
}
