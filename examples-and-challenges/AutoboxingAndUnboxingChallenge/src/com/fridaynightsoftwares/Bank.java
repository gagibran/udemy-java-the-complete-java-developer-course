package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        branches = new ArrayList<>();
        this.name = name;
    }
    public boolean addBranch(Branch branch) {
        if (!branches.contains(branch)) {
            branches.add(branch);
            return true;
        }
        return false;
    }
    public void addCustomerToBranch(Branch branch, Customer customer, double initialTransaction) {
        if (branches.contains(branch)) {
            branch.addCustomer(customer, initialTransaction);
        }
    }
    public void addTransactionToCustomerInBranch(Branch branch, Customer customer, double transaction) {
        if (branches.contains(branch)) {
            branch.addTransaction(customer, transaction);
        }
    }
    public void getCustomersInBranch(Branch branch) {
        System.out.println(branch.getName() + ":");
        branch.getCustomersAndTransactions();
    }
    public String getName() {
        return name;
    }
}
