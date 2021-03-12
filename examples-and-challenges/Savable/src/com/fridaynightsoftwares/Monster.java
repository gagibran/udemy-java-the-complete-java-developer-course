package com.fridaynightsoftwares;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> items = new ArrayList<>();
        items.add(name);
        items.add(Integer.toString(hitPoints));
        items.add(Integer.toString(strength));
        return items;
    }

    @Override
    public void read(List<String> items) {
        if (items != null && items.size() > 0) {
            name = items.get(0);
            hitPoints = Integer.parseInt(items.get(1));
            strength = Integer.parseInt(items.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
