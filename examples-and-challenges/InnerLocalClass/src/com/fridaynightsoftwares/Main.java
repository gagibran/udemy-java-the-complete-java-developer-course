package com.fridaynightsoftwares;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button button = new Button("Print");

    public static void main(String[] args) {

        // Local class, implementing IOnClickListener.
        // This can be done because IOnClickListener is a public interface:
        class ClickListener implements Button.IOnclickListener {
            public ClickListener() {
                System.out.println("I've been attached.");
            }

            @Override
            public void onClick(String strToPrint) {
                System.out.println(strToPrint + " was clicked.");
            }
        }

        // Initializing the field onClickListener, from the Button class:
        button.setOnClickListener(new ClickListener());
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
