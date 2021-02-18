package com.fridaynightsoftware;

public class Main {
    public static void main(String[] args) {

        // Basic arithmetic:
        int result = 1 + 2; // 1 + 2 = 3;
        System.out.println(result);

        int previousResult = result - 1;
        System.out.println(previousResult);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        int aNum = 3;
        int anotherNum = 77;
        int remaind = anotherNum % aNum; // Returns 2.
        System.out.println(remaind);

        // Abbreviations:
        result += 2;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        result *= 2;
        System.out.println(result);

        result /= 2;
        System.out.println(result);

        result %= 23421;
        System.out.println(result);

        //Increment and decrement:
        int anInt = 4;
        int anotherInt = 4;
        System.out.println(++anInt); // Increment with prefix: prints out 5.
        System.out.println(anotherInt--); // Decrement with postfix: prints out 4, because the variable is updated BEFORE the processing.

        // Logical operators:
        boolean areBothTrue = 40 <= 100 & 32 > 10; // This is true.
        boolean areTheseTrue = 100 >= 100 && 40 <= 34; // The second condition is false.
        System.out.println(areBothTrue); // Prints out true.
        System.out.println(areTheseTrue); // Prints out false

        boolean areThoseTrue = 40 == 100 | 32 < 10; // Both are false.
        boolean areTheseOnesTrue = 100 >= 100 || 40 >= 34; // The second condition is false, but the first is true.
        System.out.println(areThoseTrue); // Prints out false.
        System.out.println(areTheseOnesTrue); // Prints out true.
    }
}
