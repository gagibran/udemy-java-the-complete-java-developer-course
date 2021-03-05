package com.fridaynightsoftwares;

import java.util.Scanner;

public class MobilePhone {
    private Scanner scanner;
    public MobilePhone() {
        scanner = new Scanner(System.in);
    }
    public void find() {
        System.out.println("Which contact would you like to search for?");
        String contact = scanner.nextLine();
        String contactFound = Contacts.findContactName(contact);
        if (contactFound != null) {
            System.out.println("Contact: " + contact + " found. Number: " + Contacts.findContactNumber(contact) + ".");
        } else {
            System.out.println("Contact not found.");
        }
    }
    public void remove() {
        System.out.println("Which contact would you like to delete?");
        String contact = scanner.nextLine();
        String contactFound = Contacts.findContactName(contact);
        if (contactFound != null) {
            Contacts.removeContact(contactFound);
            System.out.println("Contact: " + contact + " removed.");
        } else {
            System.out.println("Contact not found.");
        }
    }
    public void add() {
        System.out.println("Which contact would you like to add?");
        String contact = scanner.nextLine();
        String contactFound = Contacts.findContactName(contact);
        if (contactFound != null) {
            System.out.println("A contact with the same name is already on the list.");
        } else {
            System.out.println("Phone:");
            long number = scanner.nextLong();
            Contacts.addNewContact(contact, number);
            System.out.println("Contact: " + contact + " of number: " + number + " added.");
            scanner.nextLine();
        }
    }
    public void update() {
        System.out.println("Which contact would you like to change?");
        String contact = scanner.nextLine();
        String contactFound = Contacts.findContactName(contact);
        if (contactFound != null) {
            System.out.println("New name:");
            String newName = scanner.nextLine();
            if (Contacts.findContactName(newName) != null) {
                System.out.println("The contact: " + newName + " of number: " + Contacts.findContactNumber(contact)
                                    + " already exists.");
            } else {
                Contacts.updateContact(contactFound, newName);
                System.out.println("New number:");
                long newNumber = scanner.nextLong();
                Contacts.updateContact(newName, newNumber);
                System.out.println("Contact: " + contactFound + " has been changed to: " + newName +
                        ". Their number is: " + newNumber + ".");
                scanner.nextLine();
            }
        } else {
            System.out.println("Contact not found.");
        }
    }
    public void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("\t0. Show contacts.");
        System.out.println("\t1. Add a new contact.");
        System.out.println("\t2. Delete a contact.");
        System.out.println("\t3. Update a contact.");
        System.out.println("\t4. Find a contact.");
        System.out.println("\t5. Print this option list.");
        System.out.println("\tPress any other number to quit.");
    }
    public void showContacts() {
        System.out.println("Contacts:");
        Contacts.printContacts();
    }
}
