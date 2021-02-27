package com.fridaynightsoftwares;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        if (tonerLevel < 0 || tonerLevel >= 100) {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100 || (tonerLevel + tonerAmount) > 100) {
            return -1;
        }
        return tonerLevel += tonerAmount;
    }

    public int printPages(int pagesToPrint) {
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesPrinted += (pagesToPrint / 2) + (pagesToPrint % 2);
            return (pagesToPrint / 2) + (pagesToPrint % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
