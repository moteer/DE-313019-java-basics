package de.brightslearning.java.basics.oop;

public class Person {
    private String name;
    private String vorName;

    public Person(String name, String vorName) {
        this.name = name;
        this.vorName = vorName;
    }

    public Person() {
    }

    public static void main(String[] args) {
        new Person();
        Person.A();
    }


    public static void A() {

    }
    private void B() {

    }

    protected void C() {

    }

    //package private
    void D() {

    }

}
