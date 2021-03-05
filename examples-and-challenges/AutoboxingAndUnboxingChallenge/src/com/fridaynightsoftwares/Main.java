// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        Bank nationalBank = new Bank("National Bank");
        Branch charlestown = new Branch("Charlestown");
        Branch denver = new Branch("Denver");
        Branch chicago = new Branch("Chicago");
        Customer jim = new Customer("Jim");
        Customer john = new Customer("John");
        Customer tom = new Customer("Tom");
        Customer johnny = new Customer("Johnny");
        Customer sarah = new Customer("Sarah");
        Customer cage = new Customer("Cage");
        Customer andy = new Customer("Andy");
        nationalBank.addBranch(charlestown);
        nationalBank.addBranch(denver);
        nationalBank.addBranch(chicago);
        nationalBank.addBranch(chicago);
        nationalBank.addCustomerToBranch(denver, andy, 11223.22);
        charlestown.addCustomer(jim, 1000.23);
        chicago.addCustomer(tom, 3333.222);
        chicago.addCustomer(tom, 3333.222);
        chicago.addCustomer(sarah, 123.22);
        chicago.addCustomer(sarah, 123.22);
        denver.addCustomer(johnny, 1324.22);
        charlestown.addCustomer(john, 234.44);
        denver.addCustomer(john, 23444422.2);
        nationalBank.addTransactionToCustomerInBranch(charlestown, sarah, 2342342.3);
        nationalBank.addTransactionToCustomerInBranch(chicago, sarah, 333321.2);
        nationalBank.addTransactionToCustomerInBranch(chicago, sarah, 44344.22);
        nationalBank.addTransactionToCustomerInBranch(chicago, sarah, 23423.33);
        nationalBank.addTransactionToCustomerInBranch(chicago, sarah, 44442.2);
        denver.addTransaction(cage, 123.321);
        System.out.println(nationalBank.getName());
        nationalBank.getCustomersInBranch(charlestown);
        System.out.println();
        nationalBank.getCustomersInBranch(denver);
        System.out.println();
        nationalBank.getCustomersInBranch(chicago);
    }
}
