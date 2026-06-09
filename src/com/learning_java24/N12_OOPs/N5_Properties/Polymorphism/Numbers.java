package com.learning_java24.N12_OOPs.N5_Properties.Polymorphism;

public class Numbers {

    // Compile-time Polymorphism
    int sum (int a , int b) {
        return a + b;
    }

    double sum (double a , int b) {
        return a + b;
    }

    int sum (int a , int b, int c) {
        return a + b + c;
    }

    void txt (String a, int b){
        System.out.println("txt1");
    }

    void txt (int a, String b){
        System.out.println("txt2");
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers();

        System.out.println(obj.sum(2.3,3));
        obj.txt("lkdjfl",5);
        obj.txt(5,"ad");

    }

}
