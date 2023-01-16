package de.brightslearning.java.basics.oop.abstraction;

public class Cappuccino extends Coffee {

    public String getMilk() {
        return "geschäumte Milch";
    }


    @Override
    public int getCoffeinInMg() {
        return 40;
    }

    @Override
    public String toString() {
        return "ich bin ein Cappuccino :)";
    }
}
