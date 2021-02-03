package com.fridaynightsoftware;

public class Main {
    public static void main(String[] args) {
        int myVar = 12;
        if (myVar == 12) {
            int anotherVar = myVar;
        } else {
            int anotherVar = 43;
        }
//        int aThirdVar = anotherVar; // Doesn't work.
//        System.out.println(anotherVar); // Doesn't work.
        if (myVar >= 12) {
            int anotherVar = 14; // This works because the block "main" is still executing.
        }
    }
}
