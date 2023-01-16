package de.brightslearning.java.basics.oop.abstraction;

public class CoffeeMachine {

    // latte / espresso / cappuccino
    public Coffee brewCoffee(String caffeeTyp) {
        Coffee coffeeToBrew = null;
        switch (caffeeTyp) {
            case "latte":
                coffeeToBrew = latte();
                break;
            case "espresso":
                coffeeToBrew = espresso();
                break;
            case "cappuccino":
                coffeeToBrew = cappuccino();
                break;
        }
        return coffeeToBrew;
    }

    private Coffee cappuccino() {
        Cappuccino cappuccino = new Cappuccino();
        foamMilk();
        espresso();
        latteArt();
        //System.out.println("Coffee cappuccino");
        return cappuccino;
    }

    private Coffee espresso() {
        Espresso espresso = new Espresso();
        //System.out.println("Coffee Espresso");
        return espresso;
    }

    private Coffee latte() {
        Latte latte = new Latte();
        //System.out.println("Coffee Latte");
        return latte;
    }

    private void foamMilk() {
        //System.out.println("create nice foam");
    }

    private void latteArt() {
        //System.out.println("add latte Art");
    }
}
