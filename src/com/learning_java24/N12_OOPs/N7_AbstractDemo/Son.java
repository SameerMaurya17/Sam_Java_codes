package com.learning_java24.N12_OOPs.N7_AbstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("I wanna be a coder");
    }

    @Override
    void partner() {
        System.out.println("I Love Katherine Pierce");
    }

}
