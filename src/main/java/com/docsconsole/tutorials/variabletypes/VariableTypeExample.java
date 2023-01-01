package com.docsconsole.tutorials.variabletypes;


import java.io.IOException;

public class VariableTypeExample {
    public static int f = 40;
    public static int j;
    protected static int g = 50;
    static int h = 60;
    private static final int i = 70;

    static {
        //a = 10; //not possible accessing of instance variable
        f = 40;
    }

    public int a = 10;
    public int e;
    protected int b = 20;
    int d = 30;
    private final int c = 30;

    {
        a = 10; //accessing of instance variable
        f = 40;
    }

    public VariableTypeExample() {
        this.a = 10;
    }

    public static void main(String[] args) throws IOException {
        VariableTypeExample vExample = new VariableTypeExample();
        vExample.localVariableTest();
        System.out.println("in main()" + vExample.a); // accessing of instance variable
        System.out.println("in main()" + vExample.b); // accessing of instance variable
        System.out.println("in main()" + vExample.c); // accessing of instance variable
        System.out.println("in main()" + vExample.d); // accessing of instance variable
        System.out.println("in main()" + vExample.e); // default value of instance variable

        System.out.println("in main()" + VariableTypeExample.f); // accessing of static variable
        System.out.println("in main()" + VariableTypeExample.g); // accessing of static variable
        System.out.println("in main()" + VariableTypeExample.h); // accessing of static variable
        System.out.println("in main()" + VariableTypeExample.i); // accessing of static variable
        System.out.println("in main()" + j); // default value of static variable
    }

    public void localVariableTest() {
        int a = 50;
        System.out.println("in localVariableTest()" + a);
        System.out.println("in localVariableTest()" + b); // accessing of instance variable
    }
    /* public void localVariableTest1() {
        int a;
        System.out.println(a);
    }*/


}