package de.brightslearning.java.basics.oop.abstraction;

public class Espresso extends Coffee{

    @Override
    public int getCoffeinInMg() {
        return 212;
    }

    @Override
    public String toString() {
        return "Ich bin ein Espresso";
    }
}
