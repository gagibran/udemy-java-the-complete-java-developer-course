package com.fridaynightsoftware;

public class Main {

    public static void main(String[] args) {

        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMinValue);
        System.out.println(floatMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMinValue);
        System.out.println(doubleMaxValue);

        int intVar = 5;
        int intVarDiv = 5 / 3;
        float floatVar = 5.25F;
        float floatVarTwo = 5.25f;
        float floatVarThree = (float)5.25;
        float floatVarDiv = 5f / 3f;
        double doubleVar = 5.25;
        double doubleVarTwo = 5.25D; // Redundant, since the default for rational numbers already is double.
        double doubleVarThree = 5.25d; // Redundant, since the default for rational numbers already is double.
        double doubleVarDiv = 5d / 3d;
        System.out.println("Integer division: 5/2 = " + intVarDiv);
        System.out.println("Float division: 5f/2f = " + floatVarDiv);
        System.out.println("Double division: 5d/2d = " + doubleVarDiv);
    }
}
