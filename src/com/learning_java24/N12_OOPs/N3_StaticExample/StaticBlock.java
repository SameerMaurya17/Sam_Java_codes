package com.learning_java24.N12_OOPs.N3_StaticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {

    static int a = 4;
    static int b;

    // will only run once, when the first obj is created i.e. when the class is loaded for the first time
    // Static block can be used to initializing the static variables
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        System.out.println("hy");

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
