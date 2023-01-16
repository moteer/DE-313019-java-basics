package de.brightslearning.java.basics.oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Coffee latte = new Latte();
        System.out.println(latte);
        System.out.println(latte.getCoffeinInMg());

        Coffee cappuccino = coffeeMachine.brewCoffee("cappuccino") ;
        System.out.println(cappuccino);
        System.out.println(cappuccino.getCoffeinInMg());


        Coffee espresso = new Espresso();
        System.out.println(espresso);
        System.out.println(espresso.getCoffeinInMg());



    }
}
