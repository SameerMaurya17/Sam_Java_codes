package com.learning_java24.N12_OOPs.N7_AbstractDemo;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(17);
        son.partner();
        son.hello();

        Daughter daughter = new Daughter(17);
        daughter.partner();

        Parent.txt();
//        Parent mom = new Parent(); // Can't make obj of Abstract class like this

    }

}
