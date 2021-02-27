package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {

        // Not protected class:
        Player player = new Player();
        player.name = "Gabriel"; // If we change the fields internally, for example, from name to fullName, we break the code.
        player.hp = 20;
        player.name = "Wand";
        player.loseHealth(10);
        System.out.println("Remaining health: " + player.getHp());
        player.hp = 200; // This application is not secure, because we can change the HP here and everything would be fine.
        player.loseHealth(11);
        System.out.println("Remaining health: " + player.getHp());

        // More protected class:
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 200, "Sword"); // The fields have validation.
        System.out.println("Health: " + enhancedPlayer.getHp()); // We can only access the fields with getters, thus, guaranteeing their validation.
        enhancedPlayer.loseHealth(10);
        System.out.println("Health: " + enhancedPlayer.getHp());
    }
}
