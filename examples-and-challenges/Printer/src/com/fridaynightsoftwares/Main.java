package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
        System.out.println();

        // Tests:
        Printer myPrinter = new Printer(100, true);
        System.out.println(myPrinter.printPages(9));
        System.out.println(myPrinter.printPages(23));
        System.out.println(myPrinter.printPages(127));
        System.out.println(myPrinter.getPagesPrinted());
    }
}
