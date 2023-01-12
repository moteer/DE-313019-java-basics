package de.brightslearning.java.basics.strings;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Strings {
    public static void main(String[] args) {

        // unabhängiges Object
        String myString = new String("some Text");
        // Literal
        String myString1 = "irgend ein Text";

        char[] chars = {'b', 'a'};
        String myString2 = new String(chars);

        System.out.println(chars.length);
        System.out.println(myString2.length());

        System.out.println(myString.contains("Text"));
        System.out.println(myString.contains("any"));

        System.out.println(myString.charAt(1));
        System.out.println(myString.indexOf("T"));
        System.out.println(myString.substring(2));
        System.out.println(myString.endsWith("Text"));

        System.out.println("A".compareTo("B"));
        System.out.println("C".compareTo("A"));

        System.out.println("a".compareToIgnoreCase("B"));

        System.out.println("#######################################");
        System.out.println("     Hello das ist mein String mit vielen Leerzeichen      "
                .replaceAll(" ", ""));

        System.out.println("AB".concat("CD"));

        myString += " here is more";
        String concat = myString.concat(" here is more");

        System.out.println(myString.replaceAll("some", "My"));



        System.out.println("     Hello das ist mein String mit vielen Leerzeichen      ".trim());
        System.out.println("Hello das ist mein String mit keine Leerzeichen".indent(10));

        System.out.println("Hello das ist mein String mit keine Leerzeichen".toUpperCase());
        System.out.println("Hello das ist mein String mit keine Leerzeichen".toLowerCase());

        // Concantenation von Strings
        System.out.println("Mein" + " String" + " ist " + " toll!" + myString);
        myString += " more stuff ...";
        myString = myString + " more stuff ...";
        System.out.println(myString);

        //

        ZonedDateTime now = ZonedDateTime.now();  // stop-watch: start
        String str = "";

        String numbers = "";
        for (int i = 1; i <= 100_000; i++) {
            numbers += i + " ";
        }

        long millisStringAppend = now.until(ZonedDateTime.now(), ChronoUnit.MILLIS);  // stop-watch: stop 1
        System.out.println("String Concat: " + millisStringAppend + " ms");

        now = ZonedDateTime.now();  // stop-watch: start
        String numbers2 = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
            sb.append(" ");
        }

        long millisStringBuilderAppend = now.until(ZonedDateTime.now(), ChronoUnit.MILLIS);  // stop-watch: stop 1
        System.out.println("String Append with StringBuilder: " + millisStringBuilderAppend + " ms");

        //System.out.println(sb);
    }
}
