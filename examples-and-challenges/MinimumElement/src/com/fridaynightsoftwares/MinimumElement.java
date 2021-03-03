package com.fridaynightsoftwares;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        return scanner.nextInt();
    }

    public static int[] readElements(int numberOfElements) {
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int returnMin(int[] array) {
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < currentMin) {
                currentMin = array[i];
            }
        }
        return currentMin;
    }
}
