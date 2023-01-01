package com.docsconsole.tutorials.variabletypes;


public class LocalVariablesInJava {
    int a1 = 10; // a int instance variable
    String s1 = "Instance String"; // a string instance variable

    LocalVariablesInJava(int a1, String s1) {
        System.out.println("a1 value (local variable in constructor): " + a1); // a int local variable in constructor
        System.out.println("s1 value (local variable in constructor): " + s1);  // a string local variable in constructor
    }

    public static void main(String[] args) {
        LocalVariablesInJava localVariablesInJava = new LocalVariablesInJava(20, "Local String in constructor");
        localVariablesInJava.displayLocalVariable();
        System.out.println("a1 value (instance variable): " + localVariablesInJava.a1);
        System.out.println("s1 value (instance variable): " + localVariablesInJava.s1);

    }

    public void displayLocalVariable() {
        int a1 = 20; // a int local variable in method
        String s1 = "Local String in method"; // a String local variable in method
        System.out.println("a1 value (local variable in method): " + a1);
        System.out.println("s1 value (local variable in method): " + s1);
        for (a1 = 40; a1 < 45; a1++) {
            String s2 = "Local String in block"; // a String local variable in the block
            System.out.println("s2 value (local variable in block): " + s2);  // a string local variable in the block
        }
    }
}