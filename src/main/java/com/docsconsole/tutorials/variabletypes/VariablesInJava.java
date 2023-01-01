package com.docsconsole.tutorials.variabletypes;


public class VariablesInJava {
    static int a1 = 9; // a static local variable
    static String s1 = "Static String"; // a static local variable
    int a2 = 10; // a instance local variable
    String s2 = "Instance String"; // a instance local variable

    public static void main(String[] args) {
        VariablesInJava variablesInJava = new VariablesInJava();
        //instance variable access
        variablesInJava.displayLocalVariable();
        System.out.println(variablesInJava.a2);
        System.out.println(variablesInJava.s2);
        //static variable access
        System.out.println(VariablesInJava.a1);
        System.out.println(VariablesInJava.s1);
        System.out.println(a1);
        System.out.println(s1);
    }

    public void displayLocalVariable() {
        int a3 = 45; // a int local variable
        String s3 = "Local String"; // a String local variable
        System.out.println(a3);
        System.out.println(s3);
    }
}