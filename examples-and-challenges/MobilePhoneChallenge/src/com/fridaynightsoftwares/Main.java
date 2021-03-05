// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

package com.fridaynightsoftwares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLoop = true;
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.printMenu();
        while (isLoop) {
            if (!scanner.hasNextInt()) {
                System.out.println("Print a valid number.\n");
                scanner.nextLine();
            } else {
                int option = scanner.nextInt();
                switch (option) {
                    case 0:
                        mobilePhone.showContacts();
                        break;
                    case 1:
                        mobilePhone.add();
                        break;
                    case 2:
                        mobilePhone.remove();
                        break;
                    case 3:
                        mobilePhone.update();
                        break;
                    case 4:
                        mobilePhone.find();
                        break;
                    case 5:
                        mobilePhone.printMenu();
                        break;
                    default:
                        isLoop = false;
                        System.out.println("Exiting now...");
                        break;
                }
            }
        }
        scanner.close();
    }
}
