package com.docsconsole.tutorials.variabletypes;


public class InstanceVariablesInJava {

    int a = 10;                    // a instance local variable
    String s = "Instance String"; // a instance local variable

    InstanceVariablesInJava(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public static void main(String[] args) {
        InstanceVariablesInJava instanceVariablesInJava = new InstanceVariablesInJava(20, "Instance String new");
        instanceVariablesInJava.display();

    }

    void display() {
        System.out.println("The instance variables: " + this.a + "and " + this.s);
    }
}
