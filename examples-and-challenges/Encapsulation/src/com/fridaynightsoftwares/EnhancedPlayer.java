package com.fridaynightsoftwares;

public class EnhancedPlayer {

    // Fields:
    private String name;
    private double hp;
    private String weapon;

    // Constructor:
    public EnhancedPlayer(String name, double hp, String weapon) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        if (hp > 100) {
            this.hp = 100;
        } else if (hp <= 0) {
            this.hp = 1;
        }
    }

    // Getter:
    public double getHp() {
        return hp;
    }

    // Public method:
    public void loseHealth(double damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.println("You died.");
        }
    }
}
