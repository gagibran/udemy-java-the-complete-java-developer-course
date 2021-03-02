package com.fridaynightsoftwares;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private String additionOne;
    private String additionTwo;
    private String additionOThree;
    private String addition;
    private double price;
    private double totalPrice;
    private double additionalPriceTotal;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasOnion;
    private boolean hasPaprika;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.totalPrice = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public double getAdditionalPriceTotal() {
        return additionalPriceTotal;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setAdditionalPriceTotal(double additionalPriceTotal) {
        this.additionalPriceTotal = additionalPriceTotal;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addAddition(String additionName, double additionalPriceTotal) {
        switch (additionName.toLowerCase()) {
            case "lettuce":
                if (!hasLettuce) {
                    totalPrice += additionalPriceTotal;
                    additionalPriceTotal += additionalPriceTotal;
                    hasLettuce = true;
                } else {
                    System.out.println("Lettuce already added.");
                }
                break;
            case "tomato":
                if (!hasTomato) {
                    totalPrice += additionalPriceTotal;
                    additionalPriceTotal += additionalPriceTotal;
                    hasTomato = true;
                } else {
                    System.out.println("Tomato already added.");
                }
                break;
            case "paprika":
                if (!hasPaprika) {
                    totalPrice += additionalPriceTotal;
                    additionalPriceTotal += additionalPriceTotal;
                    hasPaprika = true;
                } else {
                    System.out.println("Paprika already added.");
                }
                break;
            case "onion":
                if (!hasOnion) {
                    totalPrice += additionalPriceTotal;
                    additionalPriceTotal += additionalPriceTotal;
                    hasOnion = true;
                } else {
                    System.out.println("Onion already added.");
                }
                break;
            default:
                break;
        }
    }

    public void getAdditions() {
        if (hasLettuce) {
            System.out.println("Lettuce.");
        }
        if (hasOnion) {
            System.out.println("Onion.");
        }
        if (hasPaprika) {
            System.out.println("Paprika.");
        }
        if (hasTomato) {
            System.out.println("Tomato.");
        }
    }
}
