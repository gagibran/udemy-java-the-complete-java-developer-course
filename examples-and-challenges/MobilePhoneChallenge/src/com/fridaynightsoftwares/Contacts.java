package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Contacts {
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Long> numbers = new ArrayList<>();
    public static String findContactName(String contact) {
        int position = findPosition(contact);
        if (position >= 0) {
            return names.get(position);
        }
        return null;
    }
    public static long findContactNumber(String contact) {
        int position = findPosition(contact);
        if (position >= 0) {
            return numbers.get(position);
        }
        return -1;
    }
    public static void addNewContact(String contact, long number) {
        names.add(contact);
        numbers.add(number);
    }
    public static void removeContact(String contact) {
        int position = findPosition(contact);
        names.remove(contact);
        numbers.remove(position);
    }
    public static void updateContact(String contact, String newContactName) {
        names.set(findPosition(contact), newContactName);
    }
    public static void updateContact(String contact, long newNumber) {
        numbers.set(findPosition(contact), newNumber);
    }
    public static void printContacts() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + numbers.get(i));
        }
    }
    private static int findPosition(String contact) {
        return names.indexOf(contact);
    }
}
