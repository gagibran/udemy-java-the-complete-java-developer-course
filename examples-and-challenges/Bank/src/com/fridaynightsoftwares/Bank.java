package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        branches = new ArrayList<>();
        this.name = name;
    }
    public boolean addBranch(String branch) {
        if (findBranch(branch) != null) {
            return false;
        }
        branches.add(new Branch(branch));
        return true;
    }
    public boolean addCustomer(String branch, String customer, double initialTransaction) {
        Branch br = findBranch(branch);
        if (br != null) {
            return br.newCustomer(customer, initialTransaction);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branch, String customer, double transaction) {
        Branch br = findBranch(branch);
        if (br != null) {
            return br.addCustomerTransaction(customer, transaction);
        }
        return false;
    }
    public boolean listCustomers(String branch, boolean printTransactions) {
        Branch br = findBranch(branch);
        if (br != null) {
            System.out.println("Customer details for branch " + branch);
            ArrayList<Customer> customers = br.getCustomers();
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer) + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (double transaction: transactions) {
                        System.out.println("[" + (transactions.indexOf(transaction) + 1) + "]" + "  Amount " + transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }
    private Branch findBranch(String branch) {
        for (Branch b : branches) {
            if (b.getName().equals(branch)) {
                return b;
            }
        }
        return null;
    }
}
