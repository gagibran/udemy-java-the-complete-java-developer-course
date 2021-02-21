// Using the BankAccountChallenge.

package com.fridaynightsoftwares;

public class BankAccount {

    // Fields:
    private long accountNumber;
    private long customerPhoneNumber;
    private double balance;
    private String customerName;
    private String customerEmail;

    // Constructors (they can also be overloaded):
    public BankAccount(long accountNumber, long customerPhoneNumber,
                       double balance, String customerEmail,
                       String customerName) {
        this.accountNumber = accountNumber;
        this.customerPhoneNumber = customerPhoneNumber;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
    }
    public BankAccount() {
        this(0000000, 555555555,
                0, "name@example.com", "Default Name");
    }
    public BankAccount(String customMessage) {
        System.out.println(customMessage);
    }

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
