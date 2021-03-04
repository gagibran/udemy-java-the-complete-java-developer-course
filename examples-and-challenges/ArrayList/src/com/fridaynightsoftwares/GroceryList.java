package com.fridaynightsoftwares;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (String s : groceryList) {
            System.out.println(s);
        }
    }
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    // Methods that are only used internally within the class:
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
