package de.brightslearning.java.basics.methods;

public class Methods {


    /**
     * Sichbarkeiten:
     * - public    : sichtbar für jeden
     * - private   : sichtbar nur für die Klasse in der sie deklariert ist
     * - protected : im selben Package sichtbar und als sichtbar für erbende Objecte
     * - "nichts"  : nur im gleichen package sichtbar
     */
    public static final String plus(Params param) {
        return "";
    }

    public void myPublicMethod() {
        //  - public    : sichtbar für jeden
    }

    private void myPrivateMethod() {
        myProtectedMethod();
        myPackagePrivateMethod();
        //  - private   : sichtbar nur für die Klasse in der sie deklariert ist
    }

    protected void myProtectedMethod() {
        //  - protected : im selben Package sichtbar und als sichtbar für erbende Objecte
    }

    void myPackagePrivateMethod() {
        //  - "nichts"  : nur im gleichen package sichtbar
    }

    /**
     * static
     */
    public static void myStaticMethod() {
        //static        : Instanz/Object-unabhängige Methode, Es muss kein Object instanziiert werden
    }

    /**
     * Überladen von Methoden
     * overloading
     */
    public void myMethod() {

    }
    public void myMethod(Integer i) {

    }

    /**
     * @return was auch immer
     * @param alter mein Alter
     * @param name mein Name
     */
    public String myMethod(Integer alter, String name) {
        return "";
    }


    public static void main(String[] args) {
        Methods methods = new Methods();
        myStaticMethod();

        Params myParams = Params.createParams();
        myParams.a = 1;
        myParams.b = 2;

        plus(myParams);

        //overloading
        methods.myMethod();
        methods.myMethod(1);
        methods.myMethod(1, "something");

        //overwriting
        methods.equals(""); // --> false


        // Recursion
        methods.myRecursiveMethod();
    }

    private int counter =0;
    public void myRecursiveMethod() {
        if (counter <=10) {
            System.out.println(counter++);
            myRecursiveMethod();
        }
    }


    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
