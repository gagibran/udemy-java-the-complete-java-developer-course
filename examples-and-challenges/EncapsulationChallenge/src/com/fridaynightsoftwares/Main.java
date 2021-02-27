// Create a class and demonstrate proper encapsulation techniques.
// The class will be called Printer.
// It will simulate a real Computer Printer.
// It should have fields for the toner level, number of pages printed, and
// also whether it's a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {

        // Normal printer:
        System.out.println("Testing a normal printer:");
        Printer printer = new Printer(false);
        printer.printPage(10);
        System.out.println("Number of sheets already printed by the normal printer: " + printer.getPrintedSheets() + ".");
        System.out.println("Tone level of the normal printer: " + printer.getTonerLevel() + "%");
        System.out.println();

        // Duplex printer:
        System.out.println("Testing a duplex printer:");
        Printer duplexPrinter = new Printer(true);
        duplexPrinter.printPage(9);
        System.out.println("Number of sheets already printed by the duplex printer: " + duplexPrinter.getPrintedSheets() + ".");
        System.out.println("Tone level of the duplex printer: " + duplexPrinter.getTonerLevel() + "%");
        System.out.println();

        // Printing 23 more pages on the duplex:
        duplexPrinter.printPage(23);
        System.out.println("Number of sheets already printed by the duplex printer: " + duplexPrinter.getPrintedSheets() + ".");
        System.out.println("Tone level of the duplex printer: " + duplexPrinter.getTonerLevel() + "%");
        System.out.println("Adding 32% to the toner...");
        duplexPrinter.fillTonerLevel(32);
        System.out.println("Tone level of the duplex printer: " + duplexPrinter.getTonerLevel() + "%");
        System.out.println("Adding 45% to the toner...");
        duplexPrinter.fillTonerLevel(45); // Prints out the error.
        System.out.println();

        // Printing 127 more pages after the refilling:
        duplexPrinter.printPage(127);
        System.out.println("Number of sheets already printed by the duplex printer: " + duplexPrinter.getPrintedSheets() + ".");
        System.out.println("Tone level of the duplex printer: " + duplexPrinter.getTonerLevel() + "%");
        System.out.println();

        // Printing 2000 more pages to make the toner run dry.
        duplexPrinter.printPage(2000); // Stops at page 74
        System.out.println("Number of sheets already printed by the duplex printer: " + duplexPrinter.getPrintedSheets() + ".");
        System.out.println("Tone level of the duplex printer: " + duplexPrinter.getTonerLevel() + "%");
    }
}
