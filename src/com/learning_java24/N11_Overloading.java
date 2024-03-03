package com.learning_java24;

public class N11_Overloading {

    public static void main(String[] args) {

        // Function Overloading basically means that two or more function with same name

    //    fun(9);
        fun("Sameer");
    //    fun(); // Ambiguity

    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
