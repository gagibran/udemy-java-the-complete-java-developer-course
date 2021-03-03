package com.fridaynightsoftwares;

import java.util.Scanner;

public class ProcessingArray {

    public static int[] getIntegers(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[numberOfElements];
        System.out.println("Enter " + numberOfElements + " integers:");
        for (int i = 0; i < numberOfElements; i++) {
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

    public static void printIntegers(int[] array) {
        System.out.println("The elements of the array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];

        // Copying the array:
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // Algorithm:
        for (int i = 0; i < sortedArray.length; i++) {
            int currentLargest = sortedArray[i];
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] > currentLargest) {

                    // Swapping the elements when one is bigger than the next one:
                    int currentSmallest = currentLargest;
                    currentLargest = sortedArray[j];
                    sortedArray[j] = currentSmallest;
                }
            }
            sortedArray[i] = currentLargest;
        }
        return sortedArray;
    }
}
