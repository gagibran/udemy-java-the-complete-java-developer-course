/*
* Challenge:
* Create a new class VipCustomer
* it should have 3 fields name, credit limit, and email address.
* create 3 constructors
* 1st constructor empty should call the constructor with 3 parameters with default values
* 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
* 3rd constructor should save all fields.
* create getters only for this using code generation of intellij as setters wont be needed
* test and confirm it works.
* */

package com.fridaynightsoftwares;

public class VipCustomer {

    // Fields:
    private String name;
    private double creditLimit;
    private String email;

    // Constructors:
    public VipCustomer() {
        this("Default Name", 10000.45, "name@example.com");
    }
    public VipCustomer(String name, String email) {
        this(name,10000.45, email);
    }
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Getters:
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}
