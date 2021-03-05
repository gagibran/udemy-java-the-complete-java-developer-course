package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        customers = new ArrayList<>();
        this.name = name;
    }
    public boolean addCustomer(Customer customer, double initialTransaction) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            addTransaction(customer, initialTransaction);
            return true;
        }
        return false;
    }
    public boolean addTransaction(Customer customer, double transaction) {
        if (customers.contains(customer)) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    public void getCustomersAndTransactions() {
        for (Customer customer : customers) {
            System.out.println("\t" + customer.getName() + ":");
            customer.getTransactions();
        }
    }
    public String getName() {
        return name;
    }
}
