package com.fridaynightsoftwares;

public class Player {

    // Declaring fields as public:
    public String name;
    public double hp;
    public String weapon;

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
