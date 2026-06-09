package com.learning_java24.N12_OOPs.N5_Properties.Polymorphism;

public class Circle extends Shapes{

    // This will run when the obj of Circle is created
    // hence it is overriding the parent method
    @Override // This is called annotation (to check if method is overriden or not)
    void area() {
        System.out.println("Area is pie * r * r");
    }

}
