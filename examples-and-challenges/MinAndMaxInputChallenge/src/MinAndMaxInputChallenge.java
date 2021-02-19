/*
* Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
* Before the user enters the number, print the message "Enter number:"
* If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
*
* Hint:
*   Use an endless while loop.
*
* Bonus:
*   Create a project with the name MinAndMaxInputChallenge.
* */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int currentMax = 0;
        int currentMin = 0;
        boolean firstRun = true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
             boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int currentNumber = scanner.nextInt();
                if (firstRun) {
                    currentMax = currentNumber;
                    currentMin = currentNumber;
                    firstRun = false;
                }
                if (currentNumber > currentMax) {
                    currentMax = currentNumber;
                }
                if (currentNumber < currentMin) {
                    currentMin = currentNumber;
                }
            } else {
                System.out.println(currentMin);
                System.out.println(currentMax);
                break;
            }
        }
        scanner.close();
    }
}
