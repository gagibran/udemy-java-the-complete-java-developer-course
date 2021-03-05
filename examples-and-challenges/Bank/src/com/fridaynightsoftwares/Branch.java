package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        customers = new ArrayList<>();
        this.name = name;
    }
    public boolean newCustomer(String customer, double initialTransaction) {
        if (findCustomer(customer) != null) {
            return false;
        }
        customers.add(new Customer(customer, initialTransaction));
        return true;
    }
    public boolean addCustomerTransaction(String customer, double transaction) {
        Customer c = findCustomer(customer);
        if (c != null) {
            c.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customer) {
        for (Customer c : customers) {
            if (c.getName().equals(customer)) {
                return c;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
