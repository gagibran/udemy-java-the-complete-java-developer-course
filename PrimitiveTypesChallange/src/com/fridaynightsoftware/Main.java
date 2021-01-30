package com.fridaynightsoftware;

public class Main {

    public static void main(String[] args) {
        /*
        * Challenge:
        * Create a byte variable and set it to any valid byte number. Same for short and int.
        * Create a long variable and make it equal to 50_000 + 10 * (the byte variable + the short variable + the int variable).
        */
        byte byteVar = -125;
        short shortVar = 32_764;
        int intVar = 2_147_483_647;

        // shortVar had to be converted to a long in order to the expression not overflow:
        long longVar = 50_000L + 10L * (byteVar + (long)(shortVar) + intVar);
        System.out.println("The longVar is: " + longVar);
    }
}
