package com.learning_java24.N12_OOPs.N5_Properties.Polymorphism;

public class Main {

    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes shape2 = new Circle(); // Upcasting

        shape2.area();

    }

}
