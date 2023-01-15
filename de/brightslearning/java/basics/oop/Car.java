package de.brightslearning.java.basics.oop;

import java.util.Objects;

public class Car {

    private String color;
    private String marke;
    private int preis;

    private int anzahlReifen = 4;

    public Car(String color, String marke, int preis) {
        this.color = color;
        this.marke = marke;
        this.preis = preis;
    }


    public void openDoor() {
        System.out.println("door opens");
    }

    public void blinken() {
        System.out.println("blinken");
    }

    public static void main(String[] args) {
        Bmw bmw = new Bmw("red", "BMW", 3000);
        bmw.blinken();
        bmw.fahren();

        Audi audi = new Audi("blue", "Audi", 7000);
        //audi.fahren();

        Car audi2 = new Car("blue", "Audi", 7000);
        //audi2.fahren();

        boolean equals = audi.equals(audi2); // --> true
        System.out.println(equals);

        Object audiObject = (Object) audi;
        audiObject.equals(audi2);
        System.out.println("########");
        System.out.println(audiObject.equals(audi2));
        System.out.println("########");

        boolean sameIdentity = audi == audi2; // --> false
        System.out.println(sameIdentity);

        audi.setPreis(23);
        audi.setColor("orange");


        Bmw bmw1 = new Bmw("yellow", "BMW", 456789);
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        if (preis > 4000) {
            this.preis = preis;
        }
    }

    public int getAnzahlReifen() {
        return anzahlReifen;
    }

    public void setAnzahlReifen(int anzahlReifen) {
        this.anzahlReifen = anzahlReifen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return preis == car.preis && Objects.equals(color, car.color) && Objects.equals(marke, car.marke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, marke, preis);
    }
}
