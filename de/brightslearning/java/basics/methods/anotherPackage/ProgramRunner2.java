package de.brightslearning.java.basics.methods.anotherPackage;

import de.brightslearning.java.basics.methods.Methods;

public class ProgramRunner2 extends Methods{

    public static void main(String[] args) {
        Methods methods = new Methods();
        //methods.myPrivateMethod(); -> geht nicht weil private
        //methods.myProtectedMethod(); // geht nicht im selben package
    }

    public void someStuff() {
        Methods methods = new Methods();
        //methods.myPrivateMethod(); -> geht nicht weil private
        //methods.myProtectedMethod(); // geht nicht im selben package
    }

    @Override
    protected void myProtectedMethod() {
        super.myProtectedMethod(); // geht, wegen der Vererbung
    }


    //@Override
    protected void myPackagePrivateMethod() {
        //super.myPackagePrivateMethod(); // geht nicht, da nicht im gleichen package
    }


}
