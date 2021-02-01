package com.fridaynightsoftware;

public class Main {
    public static void main(String[] args) {
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

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

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
    }
}
