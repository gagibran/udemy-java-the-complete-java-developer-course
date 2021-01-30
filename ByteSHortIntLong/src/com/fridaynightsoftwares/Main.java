package com.fridaynightsoftwares;

public class Main {
    public static void main(String[] args) {
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue  = Integer.MAX_VALUE;
        System.out.println("Integer minimum value: " + intMinValue);
        System.out.println("Integer maximum value: " + intMaxValue);

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue  = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + byteMinValue);
        System.out.println("Byte maximum value: " + byteMaxValue);

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue  = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + shortMinValue);
        System.out.println("Short maximum value: " + shortMaxValue);

        long myLongValue = 100L;
        // long myLongNumber = 2_147_483_648; // We'll get an error.
        long myLongNumber = 2_147_483_648L; // This runs fine.
        System.out.println(myLongValue);
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue  = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + longMinValue);
        System.out.println("Long maximum value: " + longMaxValue);

        // byte minDivided = byteMinValue / 2; // This gives us an error.
        byte minDivided = (byte)(byteMinValue / 2); // This casts the number to a byte.
        short shortDivided = (short)(shortMinValue / 2);
    }
}
