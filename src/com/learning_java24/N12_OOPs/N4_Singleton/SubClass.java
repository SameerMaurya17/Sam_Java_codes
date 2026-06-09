package com.learning_java24.N12_OOPs.N4_Singleton;

import com.learning_java24.N12_OOPs.N6_Access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass Obj = new SubClass(43,"kjlfda");
        int n = Obj.num; // now we can access Protected member

        A obj = new A(45, "Kunal Kushwaha");
//        int n = obj.num; // this way we can't access the protected member ( coz the parent class doesn't know about it's child classes
    }
}

class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Kunal Kushwaha");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Kunal Kushwaha");
        int n = obj.num;
    }
}