package com.fridaynightsoftware;

public class Main {
    public static void main(String[] args) {
        String stringVar = "This is a string.";
        String stringVarTwo = stringVar + " Copyright: \u00a9" + "23.3" + "12.3";
        System.out.println(stringVarTwo);

        String lastString = "50";
        int intNum = 45;
        String strPlusNum = intNum + lastString;
        System.out.println("This is a string: " + strPlusNum);

        String testString = "Test.";
        testString = "Trying to change the string.";
        System.out.println(testString);
    }
}
