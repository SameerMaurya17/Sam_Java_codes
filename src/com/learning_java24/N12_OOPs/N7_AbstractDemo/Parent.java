package com.learning_java24.N12_OOPs.N7_AbstractDemo;

import com.sun.source.tree.ParenthesizedTree;

public abstract class Parent {

    int age; // Abstract class can have variables

    // Abstract class can also have constructors
    public Parent(int age){
        this.age = age;
    }

//    but we can't make Abstract constructors
//    abstract public Parent();

//    Abstract classes can have normal methods

    public void hello(){
        System.out.println("Hello, luv");
    }

//    Abstract classes can have Static methods and Static methods can't be override
    public static void txt(){
        System.out.println("It's Okay to love them both");
    }

    abstract void career();
    abstract void partner();

}
