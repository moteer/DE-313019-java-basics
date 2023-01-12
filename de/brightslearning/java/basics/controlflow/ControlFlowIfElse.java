package de.brightslearning.java.basics.controlflow;

import java.util.Objects;
import java.util.Scanner;

public class ControlFlowIfElse {

    public static void main(String[] args) {

        // Example if else 1
        if (true) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        // Example if if else 2
        if (true) {
            System.out.println("1");
        }
        if (true) {
            System.out.println("2");

        } else {
            System.out.println("3");
        }

        // Example if else if 3
        if (true) {
            System.out.println("X");
        } else if (true) {
            System.out.println("Y"); // wenn die beide Conditions auf true evalieren wird else if nicht mehr ausgeführt
        }


        // Achtung gefährlich,... besser mit {} arbeiten, nur zweite Anweisung wird hier ausgeführt
        if (false)
            System.out.println("true");
        System.out.println("wo passiert das?");

        // Tenerer Operator
        String myString = true ? "A" : "B";


    }

    public static void exampleIf(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There was ones a dog named James");
        System.out.print("What is the name of the dog: ");
        String userInput = scanner.next();
        //eingabe des nutzer
        String dogName = "James";

        if (Objects.equals(userInput.toLowerCase(), dogName.toLowerCase())) {
            //nachprüfen, ob die Worte übereinstimmen
            System.out.println("This is correct, the dogs name is James");
        } else {
            System.out.println("This is incorrect please try again");
        }
    }

}
