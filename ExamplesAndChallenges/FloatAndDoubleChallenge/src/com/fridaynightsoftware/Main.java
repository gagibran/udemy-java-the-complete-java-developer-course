package com.fridaynightsoftware;

public class Main {

    public static void main(String[] args) {
        /*
         * Challenge:
         * Create a variable with the appropriate type to store the number of pounds to be converted into kilograms.
         * Calculate the result and store it in a second appropriate variable.
         * Print out the result.
         *
         * HINT: 1 pound = 0.45359237 kg.
         * */
        double pounds = 24.3;
        double kg = pounds * 0.45_359_237;
        System.out.println(pounds + " pounds are equal to " + kg + " kg.");
    }
}
