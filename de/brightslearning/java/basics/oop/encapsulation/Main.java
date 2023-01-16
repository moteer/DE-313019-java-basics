package de.brightslearning.java.basics.oop.encapsulation;

import de.brightslearning.java.basics.oop.Birke;

public class Main {

    // Deklaration
    private Datentyp name;

    public static void main(String[] args) {

        // Deklaration
        Datentyp name;

        // Instanziierung
        name = new Datentyp();

        int [] numbers = new int[10];
        //java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(numbers[10]);

        String text = "Guten Morgen, ich hoffe ihr habt eine schöne Woche!";
        System.out.println(text.toUpperCase().replaceAll(" ", "_"));

        System.out.println(text.replace(" ", "_"));



    }

    boolean b = false;

    void abc() {
        if(b = true) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }

    }

}
