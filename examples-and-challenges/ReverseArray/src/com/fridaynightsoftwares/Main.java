// Write a method called reverse() with an int array as a parameter.
// The method should not return any value. In other words, the method is allowed to modify the array parameter.
// In main() test the reverse() method and print the array both reversed and non-reversed.
// To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and
// so on.
// For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
// Tip:
// Create a new console project with the name "ReverseArrayChallenge"


package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        System.out.println("Normal array:");
        int[] array = new int[] { 234, -234, 23525, 0, 0, 234, 435, -2443, 8776 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        ReverseArray.reverse(array);
        System.out.println("Reversed array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
