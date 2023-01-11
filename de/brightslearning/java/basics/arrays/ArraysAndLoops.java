package de.brightslearning.java.basics.arrays;

import java.util.Arrays;

public class ArraysAndLoops {

    public static void main(String[] args) {

        //String [] newArray = {"Erik","Bacdasch","Marc"};

        String[] names = new String[13];
        names[0] = "Erik";
        names[1] = "Bacdasch";
        names[9] = "Marc";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[9]);
        System.out.println();

        // Für Array Durchläufe sehr gut geeignet
        // Erste Wahl bei Array Durchläufen
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("For Loop");
        // Für Array Durchläufe sehr gut geeignet
        // zu bevorzugen, wenn der Index gehandhabt werden soll
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();

        System.out.println(Arrays.toString(names));

        System.out.println();
        System.out.println(Arrays.asList(names));

        System.out.println("While Schleife");
        // Für Array Durchläufe eher nicht geeignet
        int count = 0;
        while (count < names.length) {
            System.out.println(names[count]);
            count++;
        }

        System.out.println("Do-While Schleife");
        // Für Array Durchläufe eher nicht geeignet
        // Läuft mindestens einmal durch
        count = 0;
        do {
            System.out.println(names[count]);
            count++;
        } while (count < names.length);


    }
}
