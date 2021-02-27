package com.fridaynightsoftwares;

public class Printer {
    private double tonerLevel;
    private int printedSheets; // Empty integer defaults to 0.
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.tonerLevel = 100;
        this.isDuplex = isDuplex;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getPrintedSheets() {
        return printedSheets;
    }

    public void fillTonerLevel(double tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            System.out.println("Invalid amount.");
        }
        else if (tonerLevel >= 100) {
            System.out.println("The toner level is already 100%.");
        } else if (tonerLevel + tonerAmount > 100) {
            tonerLevel = 100;
        } else {
            System.out.println("Adding " + tonerAmount + "% to the toner...");
            tonerLevel += tonerAmount;
        }
    }

    // Considering that when a printing session finishes, it always starts with a new blank paper.
    // This algorithm is better than the one in the Print class,
    // in https://github.com/gagibran/udemy-java-the-complete-java-developer-course/tree/dev/examples-and-challenges/Printer/src/com/fridaynightsoftwares/Printer.java,
    // because here, we check for the tone level in every printed page.
    public void printPage(int numberOfPages) {
        System.out.println("Printing " + numberOfPages + " pages...");
        for (int i = 1; i <= numberOfPages; i++) {
            if (tonerLevel <= 0) {
                System.out.println("There is no toner left in the printer.");
                System.out.println("Stopped printing at page " + (i - 1) + ".");
                break;
            }
            if (isDuplex) {
                if (i % 2 != 0) {
                    printedSheets++; // Counts as a sheet printed when a page number is odd, like 1, 3, 5...
                }
            } else {
                printedSheets++;
            }
            tonerLevel -= 0.5;
        }
    }
}
