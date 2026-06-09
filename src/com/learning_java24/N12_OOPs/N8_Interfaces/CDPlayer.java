package com.learning_java24.N12_OOPs.N8_Interfaces;

public class CDPlayer implements Media{


    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
