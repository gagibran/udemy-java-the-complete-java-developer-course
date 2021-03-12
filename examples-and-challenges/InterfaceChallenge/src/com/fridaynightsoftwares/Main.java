// Create a simple interface (tip: name it Savable or ICharacter)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implements it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).
//
// Create a few sample classes that implement your Savable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.
//
// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in the Main class, write a method that restores the values to a Savable object
// e.g. calls the method from the interface for populating fields (see above).
//
// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList.
// There is a whole Java I/O section later in the course where you will get to use files, etc.



package com.fridaynightsoftwares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ICharacter gabriel = new Player("Gabriel", "Mage");
        ArrayList<String> savedGame = gabriel.save();
        System.out.println(gabriel);
        System.out.println();
        gabriel.loseHealth(50);
        System.out.println();
        debuff(gabriel);
        System.out.println();
        System.out.println(gabriel);
        gabriel.load(savedGame);
        System.out.println();
        System.out.println(gabriel);
        System.out.println();
        gabriel.castMagic();
        System.out.println();
        gabriel.doPhysicalDamage();
        ((Player) gabriel).gainExp(24.2); // Casting.
        System.out.println();
        savedGame = gabriel.save();
        System.out.println();
        ((Player) gabriel).gainExp(1234); // Casting.
        System.out.println(gabriel);
        System.out.println();
        gabriel.castMagic();
        gabriel.load(savedGame);
        System.out.println();
        System.out.println(gabriel);
        System.out.println();
        gabriel.castMagic();
    }
    public static void debuff(ICharacter character) {
        System.out.println("You have been debuffed!");
        character.loseStr(2);
        character.loseAgi(2);
        character.loseChr(2);
        character.loseDex(2);
        character.loseIntel(2);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose:\n" +
                "1 to enter a string.\n" +
                "Any other number to quit.");
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter a string:");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
        return values;
    }
}
