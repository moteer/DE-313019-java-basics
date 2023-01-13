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

    public static void main(String[] args) {
        Methods methods = new Methods();
        myStaticMethod();

        Params myParams = Params.createParams();
        myParams.a = 1;
        myParams.b = 2;

        plus(myParams);

    }
}
