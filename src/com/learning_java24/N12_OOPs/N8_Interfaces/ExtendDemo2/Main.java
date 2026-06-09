package com.learning_java24.N12_OOPs.N8_Interfaces.ExtendDemo2;

public class Main implements A , B {

    // Fun method is now not giving an error for not overriding it cause is defined default in the interface
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }

}
