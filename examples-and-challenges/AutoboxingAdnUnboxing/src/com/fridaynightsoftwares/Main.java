package com.fridaynightsoftwares;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(i * 10);
        }
        for (int number : intArrayList) {
            System.out.println(number);
        }
    }
}
