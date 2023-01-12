package de.brightslearning.java.basics.controlflow;

public class ControlFlowSwitchCase {
    public static void main(String[] args) {
        /*
        switch (variable) {
            case variable=Wert1:
                Anweisungsblock 1;
                break;
            case variable=Wert2:
                Anweisungsblock 2;
                break;
            case variable=Wert3:
                Anweisungsblock 3;
                break;
            default:
                Der letzte Anweisungsblock, für den Fall, dass die Variable != einer der Cases ist;
        }
        */
//Beispiel, in dem der Wochentag abgefragt wird:
        int wochentag = 1;
        switch (wochentag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ungültiger Wochentag");
        }
    }
}
