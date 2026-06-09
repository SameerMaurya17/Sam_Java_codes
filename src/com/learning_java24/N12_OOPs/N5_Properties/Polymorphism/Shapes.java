package com.learning_java24.N12_OOPs.N5_Properties.Polymorphism;

public class Shapes {

    // Late binding
    void area() {
        System.out.println("I am in shape");
    }

    // Early binding
//    final void area() { // Final method can't be overriding
//        System.out.println("I am in shape");
//    }

}
