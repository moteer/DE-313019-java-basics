package de.brightslearning.java.basics.controlflow;

import java.util.Scanner;

public class ControlFlowBreakContinue {

    private static void breakContinueBeispiel() {

        /** Das break Statement wird verwendet um eine Schleife zu beenden. Wie man an dem Switch Beispiel sehen kann, wird
         es auch verwendet um aus einem switch Statement zu springen. ( Sobald ein case zutrifft prüft man die restlichen
         nicht mehr.*/

        System.out.println("\n___BREAK-UND-CONTINUE___\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Wähle die Länge der Schleife:");
        int loopLength = scan.nextInt();
        System.out.println("Wähle eine Nummer, an der die Schleife beendet werden soll:");

        int userInput = scan.nextInt();
        for (int i = 0; i < loopLength; i++) {
            if (i == userInput) {
                break;
            }
            System.out.println("i ist : " + i);
        }

        /** Das continue Statement überspringt eine Iteration in der Schleife (wenn ein bestimmter Fall eintrifft) und beginnt
         * mit der nächsten Iteration
         */

        System.out.println("Wähle eine Nummer, an der die Schleife übersprungen werden soll:");

        int userInput2 = scan.nextInt();
        for (int i = 0; i < loopLength; i++) {
            if (i == userInput2) {
                continue;
            }
            System.out.println("i ist : " + i);
        }
    }

    public static void main(String[] args) {

        // Beispiel nur ungerade zahlen ausgeben mit continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

