package com.learning_java24.N12_OOPs.N7_AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I wanna be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I Love Klaus Mikaelson");
    }

}