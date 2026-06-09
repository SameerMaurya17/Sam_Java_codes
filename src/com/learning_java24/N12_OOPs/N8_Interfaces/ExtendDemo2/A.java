package com.learning_java24.N12_OOPs.N8_Interfaces.ExtendDemo2;

public interface A {
    // Default Method
    default void fun(){
        System.out.println("I am in A");
    }

    // Static Method can't be override hence it needs to be implemented (always have a body)
    // Call via the interface name
    public static void greeting(){
        System.out.println("Hello world!!");
    }

}
