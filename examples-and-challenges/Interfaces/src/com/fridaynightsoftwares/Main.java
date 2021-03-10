package com.fridaynightsoftwares;

public class Main {

    public static void main(String[] args) {

        // Using the first implementation class:
        ITelephone myPhone;
        myPhone = new DeskPhone(12345);
        myPhone.powerOn();
        myPhone.callPhone(2342342);
        myPhone.answer();

        // Using the second implementation class:
        myPhone = new MobilePhone(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();
    }
}
