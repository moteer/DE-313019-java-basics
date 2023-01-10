package de.brightslearning.java.basics.datatypes;

import java.math.BigDecimal;

public class Datatypes {

    public static void main(String[] args) {
        // primitive datatypes
        int number = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE: " + number); // shows an overflow
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE); // shows an overflow
        System.out.println("Overflow: " + (number + 1)); // shows an overflow

        int binaryNumber = 0b1000101;
        System.out.println("Binary: " + binaryNumber);

        int hexNumber = 0xAB;
        System.out.println("Hex: " + hexNumber);

        int octalNumber = 01;
        System.out.println("Octal: " + octalNumber);

        double accurateNumber;
        accurateNumber = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("Inaccuracy: " + accurateNumber); // not 1.0 ! because of internal representation of comma-based numbers
        System.out.println(100_000_000f - 1f);

        double d1 = 0.3;
        double d2 = 0.1;
        double d3 = d1-d2;
        System.out.println("Subtraktion:" + d3);

        BigDecimal bd1 = BigDecimal.valueOf(0.3);
        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = bd1.subtract(bd2);
        System.out.println("Subtraktion________:" + bd3);


        char letter = 'A';
        System.out.println("Calculating with chars: " + (letter += 3));  // walking through the Unicode table by adding ints!

        // complex datatypes / classes & objects

        String name = "Lars";
        String nameLars = "Lars";
        System.out.println("name == nameLars --> " + (name == nameLars)); // identitätscheck true
        System.out.println("String Equals: " + name.equals(nameLars)); // gleichheitscheck true


        String name2 = new String("Lars");
        String nameLars2 = new String("Lars");
        System.out.println("name2 == nameLars2 --> " + (name2 == nameLars2)); // identitätscheck false
        System.out.println("String Equals: " + name2.equals(nameLars2)); // gleichheitscheck true

        Integer intObject = Integer.valueOf(42); // new Integer(42);  // show that this constructor is deprecated & why!
        Integer intObject2 = 42;
        Integer intObject3 = 42;
        System.out.println("Int equals:" + intObject.equals(intObject2));
        System.out.println("Int ==: " + (intObject == intObject2));
        System.out.println("Int == with pooling: " + (intObject3 == intObject2));

        // blocks / scopes & visibility
        long canYouSeeMee = 123L;
        {
            System.out.println(canYouSeeMee);
            long noYouCant = 345L;
            long canYouSeeMe = 456L;
            System.out.println(canYouSeeMe);
        }
        // System.out.println(noYouCant); // not possible
        System.out.println(canYouSeeMee);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Casting
        // Implicit Casts: Small to big
        short shortValue = 123;
        int intValue = shortValue;

        // Explicit Casts: Big to small
        double realValueToCast = 1.2345678;
        float floatValue = (float) realValueToCast;

        // "Weird" Casts: char to int, boolean to int
        char charValue = 'A';
        int charToInt = charValue; // implicit
        charValue = (char) intValue; // explicit

        // Autoboxing / -unboxing
        int i = 42;
        Integer iInteger = i;
        int iUnboxed = iInteger;

        Datatypes datatypes = new Datatypes();

        Integer i1 = datatypes.myMethod(Integer.MAX_VALUE);
    }


    public int myMethod(int number) {
        int myVar = 1;
        return myVar;
    }
}