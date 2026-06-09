package com.learning_java24.N12_OOPs.N8_Interfaces;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car();

//        Engine car = new Car();
//        int n = car.a;

//        car.start();
//        car.stop();
//        car.acc();

        // Problem
//        Media carMedia = new Car();
//        carMedia.start(); // this will show Starts like a normal car instead of the starting the media

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgrageEngine();
        car.start();


    }

}
