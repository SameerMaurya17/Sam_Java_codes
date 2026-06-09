package com.learning_java24.N12_OOPs.N3_StaticExample;

public class Human {

    int age;
    String name;
    boolean married;

    // Static variables are those variables that belongs to class itself rather than objects , there variables are common for very object (same values)
    static long population;

    static void message() {
        System.out.println("Hello world");
        System.out.println(Human.population); // this can be accessed because it is a static variable which belongs to class itself rather than the obj
//        System.out.println(this.age); // can't use this over here (cause non - static variable belongs to obj and hence it can't be accessed without an obj)
    }

    public Human(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
        Human.population += 1; // here population is a static variable which belongs to class itself rather than the obj so here we are using Human.population rather than this.population
        // we can still use this.population but it's better to use class name Human.population
//        this.population += 1; // this will still work but it's better to use class name
    }

    public void show(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.married);
        System.out.println(Human.population);
    }

    public static void main(String[] args) {

        System.out.println("hy");
        StaticBlock obj = new StaticBlock(); // here static block will execute cause StaticBlock class is loaded here
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }

}
