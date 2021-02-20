package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setLastName("");
        System.out.println(person.getFullName());
    }
}
