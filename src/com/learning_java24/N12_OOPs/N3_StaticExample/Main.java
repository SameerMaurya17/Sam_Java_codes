package com.learning_java24.N12_OOPs.N3_StaticExample;

public class Main {

    public static void main(String[] args) {

        Human sameer = new Human(17,"Sameer",false);
        System.out.println(sameer.name);
        System.out.println(Human.population); // for accessing the static variable use Class name , obj name will also work but better tto use class name
//        System.out.println(Sameer.population); // this will still work but not ideal to use obj name use class name instead

        Human aryan = new Human(18,"Aryan",false);
        System.out.println(Human.population);
//        System.out.println(sameer.population);
//        System.out.println(aryan.population);

        fun();

        Main funn = new Main();
        funn.fun2(); // here we are using only one obj to call fun2 and greeting methods

    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance || obj
        // but the function you are using it in does not depend on instances (cause this is a static method)

        // you cannot access non static stuff without referencing their instances || obj in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        System.out.println("fun2");
        greeting(); // here we can access the non static member in non static member without the help of the object
                    // cause fun2() will be called by an object hence thats why we don't need obj for greeting() to call
    }

    // we know that something which is not static, belongs to an object and it will need a obj to get called
    void greeting() {
//        fun();
        System.out.println("greeting");
    }

}
