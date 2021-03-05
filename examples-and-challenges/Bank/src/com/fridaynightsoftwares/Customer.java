package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;
    public Customer(String name, double initialTransaction) {
        transactions = new ArrayList<>();
        addTransaction(initialTransaction);
        this.name = name;
    }
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
