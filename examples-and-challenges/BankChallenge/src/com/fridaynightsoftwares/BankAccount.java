/*
* Create a new class for a bank account
* Create fields for the account number, balance, customer name, email and phone number.
*
* Create getters and setters for each field
* Create two additional methods
* 1. To allow the customer to deposit funds (this should increment the balance field).
* 2. To allow the customer to withdraw funds. This should deduct from the balance field,
* but not allow the withdrawal to complete if their are insufficient funds.
* You will want to create various code in the Main class (the one created by IntelliJ) to
* confirm your code is working.
* Add some System.out.println in the two methods above as well.
* */

package com.fridaynightsoftwares;

public class BankAccount {

    // Fields:
    private long accountNumber;
    private long customerPhoneNumber;
    private double balance;
    private String customerName;
    private String customerEmail;

    // Setters:
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    // Getters:
    public long getAccountNumber() {
        return this.accountNumber;
    }
    public long getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    // General methods:
    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println("Added " + funds + " USD. Total available: " + balance + " USD.");
    }
    public void withdrawFunds(double funds) {
        if (this.balance - funds >= 0) {
            this.balance -= funds;
            System.out.println("Removed " + funds + " USD. Total available: " + balance + " USD.");
        } else {
            System.out.println("Insufficient funds: " + balance + " USD.");
        }
    }
}
