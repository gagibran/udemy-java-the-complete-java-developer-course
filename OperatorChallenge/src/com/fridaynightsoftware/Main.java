package com.fridaynightsoftware;

public class Main {

    public static void main(String[] args) {
        /**
         * Challenge:
         * 1. Create a double variable with a value of 20.00;
         * 2. Create a second variable of type double with a value of 80.00;
         * 3. Add both numbers together and multiply by 100.00;
         * 4. Figure out what's the remainder of step 3 and 40.00;
         * 5. Create a boolean variable that assigns the value true if the remainder from step 4 is 0, or false otherwise;
         * 6. Output the boolean variable of step 5;
         * 7. Write an if-then statement that displays the message "Got some remainder!" if the boolean on step 5 is NOT true.
         */

        double numberToAddOne = 20.00;
        double numberToAddTwo = 80.00;
        double addedAndMultipliedNumbers = (numberToAddOne + numberToAddTwo) * 100.00;
        System.out.println(addedAndMultipliedNumbers);
        int remainder = (int)(addedAndMultipliedNumbers % 40.00);
        System.out.println(remainder);
        boolean hasNotRemainder = remainder == 0;
        System.out.println(hasNotRemainder);
        if (!hasNotRemainder) {
            System.out.println("Got some remainder!");
        }
    }
}
