package com.fridaynightsoftwares;

import java.util.ArrayList;
import java.util.List;

public class Player implements ICharacter {
    private final String LOSE_MESSAGE = "Lost ";
    private String name;
    private String playerClass;
    private int level;
    private double xp;
    private double hp;
    private double mp;
    private double dex;
    private double agi;
    private double str;
    private double chr;
    private double intel;

    public Player(String name, String playerClass) {
        this.name = name;
        this.playerClass = playerClass;
        level = 1;
        xp = 0;
        if (playerClass.equals("Warrior")) {
            hp = 210;
            mp = 50;
            agi = 5;
            dex = 5;
            str = 10;
            chr = 5;
            intel = 3;
        } else if (playerClass.equals("Mage")) {
            hp = 100;
            mp = 150;
            agi = 2;
            dex = 7;
            str = 3;
            chr = 7;
            intel = 10;
        } else if (playerClass.equals("Rouge")) {
            hp = 130;
            mp = 100;
            agi = 9;
            dex = 9;
            str = 4;
            chr = 9;
            intel = 4;
        }
    }
    @Override
    public void loseHealth(double damage) {
        System.out.println(LOSE_MESSAGE + damage + " HP!");
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            System.out.println("You died.");
        }
    }
    @Override
    public void loseMp(double damage) {
        System.out.println(LOSE_MESSAGE + damage + " MP!");
        mp -= damage;
        if (mp <= 0) {
            mp = 0;
            System.out.println("You have no mana.");
        }
    }
    @Override
    public void loseStr(double damage) {
        System.out.println(LOSE_MESSAGE + damage + " STR!");
        str -= damage;
        if (str <= 0) {
            str = 0;
            System.out.println("You are feeling weak.");
        }
    }
    @Override
    public void loseIntel(double damage) {
        System.out.println(LOSE_MESSAGE + damage + " INT!");
        intel -= damage;
        if (intel <= 0) {
            intel = 0;
            System.out.println("You can't even pronounce your name anymore.");
        }
    }
    @Override
    public void loseAgi(double damage) {
        System.out.println(LOSE_MESSAGE + damage + " AGI!");
        agi -= damage;
        if (agi <= 0) {
            agi = 0;
            System.out.println("Too slow.");
        }
    }
    @Override
    public void loseDex(double damage) {
        System.out.println(LOSE_MESSAGE + damage + " DEX!");
        dex -= damage;
        if (dex <= 0) {
            dex = 0;
            System.out.println("You don't know how to hold a butter knife anymore.");
        }
    }
    @Override
    public void loseChr(double damage) {
        System.out.println(LOSE_MESSAGE + damage + " CHR!");
        chr -= damage;
        if (chr <= 0) {
            chr = 0;
            System.out.println("Ew! So ugly.");
        }
    }
    @Override
    public void castMagic() {
        if (playerClass.equals("Mage")) {
            if (mp > 0) {
                System.out.println("You conjure a ball of fire, causing " + (intel * 7 + dex * 0.5) + " points of damage.");
                loseMp(10);
            } else {
                System.out.println("No mana left to cast magic.");
            }
        } else {
            System.out.println("Only mages can cast magic.");
        }
    }
    @Override
    public void doPhysicalDamage() {
        if (playerClass.equals("Warrior")) {
            System.out.println("You furiously strike the enemy with your sword, causing " + (str * 10 + (dex + agi) * 0.2) + " points of damage.");
        } else if (playerClass.equals("Mage")) {
            System.out.println("You pathetically strike the enemy with your wand, causing " + (str * 3) + " points of damage.");
        } else {
            System.out.println("You fiercely strike the enemy sing your bow and arrows, causing " + (str * 3 + (dex + agi) * 0.7) + " points of damage." );
        }
    }

    @Override
    public String toString() {
        return name + ": " + playerClass + ". Level: " + level + ". Experience: " + xp +
                "\nHP: " + hp +
                "\nMP: " + mp +
                "\nSTR: " + str +
                "\nINT: " + intel +
                "\nAGI: " + agi +
                "\nDEX: " + dex +
                "\nCHR: " + chr;
    }
    public void gainExp(double xp) {
        this.xp += xp;
        levelUp();
    }
    public void levelUp() {
        while (this.xp >= 100) {
            level += 1;
            System.out.println("You've leveled up to level " + level + ".");
            this.xp -= 100;
            if (playerClass.equals("Warrior")) {
                System.out.println("Gained 50 HP, 10 MP, 4 STR, 3 DEX, 1 AGI, 1 INT, and 1 CHR.");
                hp += 50;
                mp += 10;
                str += 4;
                dex += 3;
                agi += 1;
                intel += 1;
                chr += 1;
            } else if (playerClass.equals("Mage")) {
                System.out.println("Gained 10 HP, 50 MP, 1 STR, 3 DEX, 1 AGI, 4 INT, and 2 CHR.");
                hp += 10;
                mp += 50;
                str += 2;
                dex += 3;
                agi += 1;
                intel += 4;
                chr += 2;
            } else {
                System.out.println("Gained 20 HP, 30 MP, 2 STR, 2 DEX, 2 AGI, 2 INT, and 1 CHR.");
                hp += 20;
                mp += 30;
                str += 2;
                dex += 2;
                agi += 2;
                intel += 2;
                chr += 1;
            }
        } if (xp < 100) {
            System.out.println("You need " + (100 - xp) + " more experience points to level up.");
        }
    }
    @Override
    public ArrayList<String> save() {
        ArrayList<String> savedPlayer = new ArrayList<>();
        savedPlayer.add(name);
        savedPlayer.add(playerClass);
        savedPlayer.add(Integer.toString(level));
        savedPlayer.add(Double.toString(xp));
        savedPlayer.add(Double.toString(hp));
        savedPlayer.add(Double.toString(mp));
        savedPlayer.add(Double.toString(str));
        savedPlayer.add(Double.toString(agi));
        savedPlayer.add(Double.toString(chr));
        savedPlayer.add(Double.toString(dex));
        savedPlayer.add(Double.toString(intel));
        return savedPlayer;
    }
    @Override
    public void load(List<String> values) {
        name = values.get(0);
        playerClass = values.get(1);
        level = Integer.parseInt(values.get(2));
        xp = Double.parseDouble(values.get(3));
        mp = Double.parseDouble(values.get(4));
        str = Double.parseDouble(values.get(5));
        agi = Double.parseDouble(values.get(6));
        chr = Double.parseDouble(values.get(7));
        dex = Double.parseDouble(values.get(8));
        intel = Double.parseDouble(values.get(9));
    }
}
