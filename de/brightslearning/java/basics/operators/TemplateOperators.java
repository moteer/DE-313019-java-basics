package de.brightslearning.java.basics.operators;

public class TemplateOperators {
    public static void main(String[] args) {

        //unäre Operatoren
        int number = 1;
        System.out.println(number++);
        System.out.println(++number);

        int myNumber = 11;
        //Tenären Operatoren
        String isNumberBig = (myNumber > 10) ? getMyString() : "Klein";
        System.out.println(isNumberBig);
    }

    private static String getMyString() {
        System.out.println("logic here ...");
        return "Groß mit Logik";
    }
}