package com.fridaynightsoftwares;

public class Main {
    public static void main(String[] args) {

        // Initializing with the empty constructor:
        BankAccount account  = new BankAccount("Empty constructor.");
        account.setAccountNumber(234234);
        account.setCustomerEmail("john.doe@example.com");
        account.setCustomerPhoneNumber(32443456);
        account.setCustomerName("John Doe");
        account.setBalance(1000.23);

        // Initializing with the constructor that takes in arguments:
        BankAccount newAccount = new BankAccount(123123, 234234234,
                                            1000.3, "john.doe@example.com", "John Doe");

        // Initializing with the constructor that makes the default values:
        BankAccount anotherAccount = new BankAccount();

        // Reading values set without the empty constructor:
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerEmail());
        System.out.println(account.getCustomerName());
        System.out.println(account.getCustomerPhoneNumber());
        System.out.println();

        // Reading values set with the constructor that takes in arguments:
        System.out.println(newAccount.getAccountNumber());
        System.out.println(newAccount.getBalance());
        System.out.println(newAccount.getCustomerEmail());
        System.out.println(newAccount.getCustomerName());
        System.out.println(newAccount.getCustomerPhoneNumber());
        System.out.println();

        // Reading values set with the constructor that makes the default values:
        System.out.println(anotherAccount.getAccountNumber());
        System.out.println(anotherAccount.getBalance());
        System.out.println(anotherAccount.getCustomerEmail());
        System.out.println(anotherAccount.getCustomerName());
        System.out.println(anotherAccount.getCustomerPhoneNumber());
        System.out.println();

        // Challenge:
        VipCustomer firstVip = new VipCustomer();
        System.out.println(firstVip.getCreditLimit());
        System.out.println(firstVip.getEmail());
        System.out.println(firstVip.getName());
        System.out.println();
        VipCustomer secondVip = new VipCustomer("John Doe", "jonh.doe@example.com");
        System.out.println(secondVip.getCreditLimit());
        System.out.println(secondVip.getEmail());
        System.out.println(secondVip.getName());
        System.out.println();
        VipCustomer thirdVip = new VipCustomer("William Dafoe", 1_000_000.67,
                                                "william.dafoe@gmail.com");
        System.out.println(thirdVip.getCreditLimit());
        System.out.println(thirdVip.getEmail());
        System.out.println(thirdVip.getName());
    }
}
