package de.brightslearning.java.basics.oop.abstraction;

public class Latte extends Coffee{

    public String getMilk() {
        return "Milch und Milchschaum";
    }


    @Override
    public int getCoffeinInMg() {
        return 30;
    }

    @Override
    public String toString() {
        return "Ich bin ein Latte";
    }
}
