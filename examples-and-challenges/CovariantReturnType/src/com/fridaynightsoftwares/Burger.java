package com.fridaynightsoftwares;

public class Burger {

    // Fields:
    private boolean lettuce;
    private int bacon;
    private int tomato;
    private boolean wholeBread;
    private boolean mayo;
    private boolean salt;
    private boolean pepper;
    private int meat;
    private int cheese;
    private boolean quark;

    // Constructor:
    public Burger(boolean lettuce, int bacon, int tomato,
                  boolean wholeBread, boolean mayo, boolean salt,
                  boolean pepper, int meat, int cheese, boolean quark) {
        this.lettuce = lettuce;
        this.bacon = bacon;
        this.tomato = tomato;
        this.wholeBread = wholeBread;
        this.mayo = mayo;
        this.salt = salt;
        this.pepper = pepper;
        this.meat = meat;
        this.cheese = cheese;
        this.quark = quark;
    }

    // Getters:
    public boolean isLettuce() {
        return lettuce;
    }
    public int getBacon() {
        return bacon;
    }
    public int getTomato() {
        return tomato;
    }
    public boolean isWholeBread() {
        return wholeBread;
    }
    public boolean isMayo() {
        return mayo;
    }
    public boolean isSalt() {
        return salt;
    }
    public boolean isPepper() {
        return pepper;
    }
    public int getMeat() {
        return meat;
    }
    public int getCheese() {
        return cheese;
    }
    public boolean isQuark() {
        return quark;
    }
}
