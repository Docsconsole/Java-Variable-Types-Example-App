package com.docsconsole.tutorials.variabletypes;

public class StaticVariableInJava {
    static int a = 9; // a static local variable 
    static String s = "Static String"; // a static local variable 

    public static void main(String[] args) {
        StaticVariableInJava staticVariableInJava = new StaticVariableInJava();
        System.out.println("static variables are " + a + "and " + s);
        System.out.println("static variables are " + StaticVariableInJava.a + "and " + StaticVariableInJava.s);
    }
}