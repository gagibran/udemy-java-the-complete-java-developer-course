package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a the number of elements for the array:");
        int numberOfElements = MinimumElement.readInteger();
        System.out.println("Enter the elements of the array:");
        int[] array = MinimumElement.readElements(numberOfElements);
        System.out.println("The smallest element of this array is:");
        System.out.println(MinimumElement.returnMin(array));
        String test = "test";
        String two = "two";
        if (test.equals(two)) {

        }
    }
}
