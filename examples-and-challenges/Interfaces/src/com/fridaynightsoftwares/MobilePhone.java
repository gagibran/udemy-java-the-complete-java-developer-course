package com.fridaynightsoftwares;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        isOn = false;
    }
    @Override
    public void powerOn() {
        System.out.println("Mobile phone powered up.");
        isOn = true;
    }
    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing: " + myNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off.");
        }
    }
    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if (myNumber == phoneNumber && isOn) {
            System.out.println("Ring ring!");
            isRinging = true;
        } else if (!isOn) {
            System.out.println("The phone is switched off.");
            isRinging = false;
        } else {
            System.out.println("The number called is different than mine.");
            isRinging = false;
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
