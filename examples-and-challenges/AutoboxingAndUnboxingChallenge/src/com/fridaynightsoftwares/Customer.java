package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;
    public Customer(String name) {
        transactions = new ArrayList<>();
        this.name = name;
    }
    public void addTransaction(double transaction) {
        transactions.add(transaction); // Autoboxing.
    }
    public String getName() {
        return name;
    }
    public void getTransactions() {
        for (double transaction : transactions) { // Unboxing.
            System.out.println("\t\t" + transaction + " USD.");
        }
    }
}
