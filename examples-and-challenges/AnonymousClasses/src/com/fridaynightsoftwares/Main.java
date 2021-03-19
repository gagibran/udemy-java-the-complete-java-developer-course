package com.fridaynightsoftwares;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button button = new Button("Print");

    public static void main(String[] args) {

        // Instead of creating a local class and instantiate it, like we did with local classes,
        // we create and instantiate the class (since it's got no name) as an argument to setOnClickListener():
        button.setOnClickListener(new Button.IOnclickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
        listen();
    }

    // Local method that gets an user's input:
    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                button.onClick();
            } else {
                quit = true;
            }
        }
    }
}
