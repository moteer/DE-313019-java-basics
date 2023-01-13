package de.brightslearning.java.basics.methods;

public class Params {
    public Integer a;
    public int b;
    public int c;
    public int d;
    public int f;
    public int g;

    // Builder Design Pattern Pattern Implentierung
    public static Params createParams() {
        return new ParamsBuilder().createParams();
    }
}
