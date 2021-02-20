package com.fridaynightsoftwares;

import java.util.Scanner;

public class Main {

    // Constants:
    public static final String ERROR_MESSAGE = "Please, enter a valid number.\n";

    public static void main(String[] args) {

        // Set up:
        BankAccount account = new BankAccount();
        account.setAccountNumber(123124234234L);
        account.setCustomerPhoneNumber(5345345212342L);
        account.setBalance(1000.43);
        account.setCustomerEmail("jonhdoe@example.com");
        account.setCustomerName("John Doe");

        // Saving immutable value to local variable:
        long accountNumber = account.getAccountNumber();

        // Console print out:
        System.out.println("Welcome, " + account.getCustomerName() + ". Your account number is: "
                            + accountNumber + ". Select an option by entering a number: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Check balance.");
            System.out.println("2. Add funds.");
            System.out.println("3. Withdraw funds.");
            System.out.println("4. Change name.");
            System.out.println("5. Change e-mail address.");
            System.out.println("6. Change phone number.");
            System.out.println("Enter any other number to exit.");
            boolean isInt = scanner.hasNextInt();
            if (!isInt) {
                System.out.println("Please, press a valid option.");
                scanner.nextLine();
            } else {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Your current balance is: " + account.getBalance() + " USD.\n");
                        break;
                    case 2:
                        double fundsAdded;
                        System.out.println("How many funds do you want to add?");
                        while (true) {
                            scanner.nextLine();
                            boolean isFundsAddedDouble = scanner.hasNextDouble();
                            if (isFundsAddedDouble) {
                                fundsAdded = scanner.nextDouble();
                                break;
                            } else {
                                System.out.println(ERROR_MESSAGE);
                            }
                        }
                        account.depositFunds(fundsAdded);
                        break;
                    case 3:
                        double fundsWithdrawn;
                        System.out.println("How many funds do you want to withdraw?");
                        while (true) {
                            scanner.nextLine();
                            boolean isWithdrawFundsDouble = scanner.hasNextDouble();
                            if (isWithdrawFundsDouble) {
                                fundsWithdrawn = scanner.nextDouble();
                                break;
                            } else {
                                System.out.println(ERROR_MESSAGE);
                            }
                        }
                        account.withdrawFunds(fundsWithdrawn);
                        break;
                    case 4:
                        System.out.println("Current name: " + account.getCustomerName());
                        System.out.println("Change to: ");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        account.setCustomerName(newName);
                        System.out.println("Welcome, " + account.getCustomerName() + ".");
                        break;
                    case 5:
                        System.out.println("Current e-mail address: " + account.getCustomerEmail());
                        System.out.println("Change to: ");
                        scanner.nextLine();
                        String newEmail = scanner.nextLine();
                        account.setCustomerEmail(newEmail);
                        System.out.println("New e-mail set: " + account.getCustomerEmail() + ".");
                        break;
                    case 6:
                        long newNumber;
                        System.out.println("Current number: " + account.getCustomerPhoneNumber());
                        System.out.println("Change to: ");
                        while (true) {
                            scanner.nextLine();
                            boolean isNumberLong = scanner.hasNextLong();
                            if (isNumberLong) {
                                newNumber = scanner.nextLong();
                                break;
                            } else {
                                System.out.println(ERROR_MESSAGE);
                            }
                        }
                        account.setCustomerPhoneNumber(newNumber);
                        System.out.println("New phone number set: " + account.getCustomerPhoneNumber() + ".");
                        break;
                    default:
                        System.out.println("Exiting now...");
                        break;
                }
                if (option < 0 || option > 6) {
                    break;
                }
            }
        }
        scanner.close();
    }
}
