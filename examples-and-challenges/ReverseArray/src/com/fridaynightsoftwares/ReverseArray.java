package com.fridaynightsoftwares;

public class ReverseArray {
    public static void reverse(int[] array) {
        int currentValue;
        for (int i = array.length / 2; i >= 0; i--) {
            currentValue = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = currentValue;
        }
    }
}
