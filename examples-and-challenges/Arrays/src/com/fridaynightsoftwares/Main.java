package com.fridaynightsoftwares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] ints = getIntegers(5);
        System.out.println("\nThe values are:");
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println("\nThe average is:");
        System.out.println(getAvg(ints));
    }
    public static int[] getIntegers(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[numberOfElements];
        System.out.println("Enter " + numberOfElements + " integer values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAvg(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
