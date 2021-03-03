package com.fridaynightsoftwares;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        for (String s : groceryList) {
            System.out.println(s);
        }
    }
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + position + " has been modified.");
    }
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item " + theItem + " at position " + position + " has been removed.");
    }
}
