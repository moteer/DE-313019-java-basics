package de.brightslearning.java.basics.oop.encapsulation;

public class Encapsulation {
    private int dontLookAtMe = 1;
    private int changeMe = 4;

    private void dontCallMeIfYouDontKnowMe() {

    }
    public int getChangeMe() {
        return changeMe;
    }

    public void setChangeMe(int changeMe) {
        this.changeMe = changeMe;
    }

}
