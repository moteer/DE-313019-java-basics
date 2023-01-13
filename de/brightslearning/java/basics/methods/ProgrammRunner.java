package de.brightslearning.java.basics.methods;

public class ProgrammRunner {
    public static void main(String[] args) {
        Methods methods = new Methods();
        //methods.myPrivateMethod(); -> geht nicht weil private
        methods.myProtectedMethod();
        methods.myPackagePrivateMethod();
    }
}
