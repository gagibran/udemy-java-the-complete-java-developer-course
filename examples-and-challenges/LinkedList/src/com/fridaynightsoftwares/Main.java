package com.fridaynightsoftwares;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInAlphabeticalOrder("Sidney", placesToVisit);
        addInAlphabeticalOrder("Melbourne", placesToVisit);
        addInAlphabeticalOrder("Brisbane", placesToVisit);
        addInAlphabeticalOrder("Perth", placesToVisit);
        addInAlphabeticalOrder("Canberra", placesToVisit);
        addInAlphabeticalOrder("Adelaide", placesToVisit);
        addInAlphabeticalOrder("Darwin", placesToVisit);
        printList(placesToVisit);
        addInAlphabeticalOrder("Darwin", placesToVisit);
        addInAlphabeticalOrder("Alice Springs", placesToVisit);
        printList(placesToVisit);
        visit(placesToVisit);


    }
    private static void printList(LinkedList<String> linkedList) {
            for (String s : linkedList) {
                System.out.println("Now visiting " + s);
            }
        System.out.println("\n===============================\n");
        }
    private static boolean addInAlphabeticalOrder(String newCity, LinkedList<String> cities) {
        ListIterator<String> stringListIterator = cities.listIterator(); // Doesn't actually points to the header.
        while(stringListIterator.hasNext()) { // While there is a next node.
            int comparison = stringListIterator.next().compareTo(newCity); // If it's running for the first time, properly points to the header.
            if (comparison == 0) {
                System.out.println("City \"" + newCity + "\" already in the list.");
                return false;
            } else if (comparison > 0) { // The new city is alphabetically greater than its predecessor.
                stringListIterator.previous(); // Moves the cursor to the previous node. Example: the cursor was on "Brisbane" and newCity is "Adelaide".
                stringListIterator.add(newCity); // Adds the city.
                return true;
            }
        }
        stringListIterator.add(newCity); // Inserts the new city to the end of the iterator, if newCity isn't bigger than any other of its predecessors.
        return true;
    }
    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> iterator = cities.listIterator();
        if (cities.getFirst().isEmpty()) { // If the header is null (the list has no nodes).
            System.out.println("No cities in the itinerary.");
        } else {
            System.out.println("Now visiting " + iterator.next()); // Goes to the header.
            printMenu();
        }
        while (!quit) {
            int action  = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    if (!goingForward) { // If we were going backwards
                        if (iterator.hasNext()) {
                            iterator.next(); // Go to the next city once (if possible).
                        }
                        goingForward = true;
                    }
                    if (iterator.hasNext()) { // If the next node isn't null.
                        System.out.println("Now visiting " + iterator.next()); // Go to the next city (twice if we were going backwards).
                    } else {
                        System.out.println("Reached the end of the itinerary.");
                        goingForward = false; // Can't go forward anymore. We're at the end.
                    }
                    break;
                case 2:
                    if (goingForward) { // If we were going forward:
                        if (iterator.hasPrevious()) {
                            iterator.previous(); // Go to the previous city once (if possible).
                        }
                        goingForward = false; // States that went backwards.
                    }
                    if (iterator.hasPrevious()) { // If the previous node isn't null (it is if we're on the header).
                        System.out.println("Now visiting " + iterator.previous()); // Go to the previous city (twice if we were going forward).
                    } else {
                        System.out.println("Reached the start of the itinerary.");
                        goingForward = true; // Can't go backwards anymore. We're at the start.
                    }
                    break;
                case 3:
                    printMenu();
                default:
                    System.out.println("Vacation over.");
                    quit = true;
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions:");
        System.out.println("Press 1 to go to the next city.");
        System.out.println("Press 2 to go to the previous city.");
        System.out.println("Press 3 to print this menu.");
        System.out.println("Press any other number to quit.");
    }
}
