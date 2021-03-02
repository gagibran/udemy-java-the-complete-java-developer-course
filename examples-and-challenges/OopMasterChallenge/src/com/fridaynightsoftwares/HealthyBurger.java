package com.fridaynightsoftwares;

public class HealthyBurger extends Hamburger {
    private boolean hasRicotta;
    private boolean hasCarrot;

    public HealthyBurger(String name, String meat, double price) {
        super(name, "Brown rye bread roll", meat, price);
    }

    @Override
    public void addAddition(String additionName, double additionalPrice) {
        super.addAddition(additionName, additionalPrice);
        switch (additionName.toLowerCase()) {
            case "ricotta":
                if (!hasRicotta) {
                    setTotalPrice(getTotalPrice() + additionalPrice);
                    setAdditionalPriceTotal(getAdditionalPriceTotal() + additionalPrice);
                    hasRicotta = true;
                } else {
                    System.out.println("Ricotta already added.");
                }
                break;
            case "carrot":
                if (!hasCarrot) {
                    setTotalPrice(getTotalPrice() + additionalPrice);
                    setAdditionalPriceTotal(getAdditionalPriceTotal() + additionalPrice);
                    hasCarrot = true;
                } else {
                    System.out.println("Carrot already added.");
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void getAdditions() {
        super.getAdditions();
        if (hasRicotta) {
            System.out.println("Ricotta.");
        }
        if (hasCarrot) {
            System.out.println("Carrot.");
        }
    }
}
