package com.learning_java24.N12_OOPs.N4_Singleton;

import com.learning_java24.N12_OOPs.N6_Access.A;

public class Main {

    public static void main(String[] args) {

//        Singleton obj = new Singleton(); // can't create obj of Singleton class cause the constructor is private

        Singleton obj1 = Singleton.getObj(); // here we are using a method named .getObj() which is static and returns one obj reference
        // obj 1 2 3 all are referenced to one single obj of Singleton class
        Singleton obj2 = Singleton.getObj();
        Singleton obj3 = Singleton.getObj();

        // all 3 ref variables are pointing to just one object

        A a = new A(10, "Kunal");
        a.getNum();
//        int n = a.num; // Protected member
    }

}
