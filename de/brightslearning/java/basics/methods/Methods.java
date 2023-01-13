package de.brightslearning.java.basics.methods;

public class Methods {

    int instanzVariable;

    public static final String plus(Params param) {
        return "";
    }

    private void myPrivateMethod() {
        myProtectedMethod();
        myPackagePrivateMethod();
    }

    protected void myProtectedMethod() {

    }

    void myPackagePrivateMethod() {

    }

    // Sichbarkeit:
    //  - public    : sichtbar für jeden
    //  - private   : sichtbar nur für die Klasse in der sie deklariert ist
    //  - protected : im selben Package sichtbar und als sichtbar für erbende Objecte
    //  - "nichts"  : nur im gleichen package sichtbar


    //static        : Instanz/Object-unabhängige Methode, Es muss kein Object instanziiert werden


    public static void myStaticMethod() {

    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        myStaticMethod();

        Params myParams = Params.createParams();
        myParams.a= 1;
        myParams.b= 2;

        plus(myParams);
    }
}
