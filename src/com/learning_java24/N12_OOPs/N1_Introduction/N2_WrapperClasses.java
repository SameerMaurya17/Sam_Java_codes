package com.learning_java24.N12_OOPs.N1_Introduction;

public class N2_WrapperClasses {

    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

        // Final keyword values can't be changes
        // Internally it works , when variable is declared it should be initialized at that time only and it will point to an obj
        // and that it can't point or change to other obj , Notice :- changes to obj can still happen like modifying the obj

//        final int bonus = 2;
//        bonus = 3;

        // here we are modifying the object not allocating a new obj hence it's working
        final A sam = new A("Sameer Maurya");
        System.out.println(sam.name);
        sam.name = "new name";
        System.out.println(sam.name);

// when a non primitive is final, you cannot reassign it.
//        sam = new A("new object"); // here it will give an error cause sam obj is final and it can't point to another obj


        // Garbage collection example
        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }


    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A{

    String name;

    A(String name){
        this.name = name;
    }

    // finalilze is like a destructor but in java it automatically does the garbage collection we can't run it manually
    @Override
    protected void finalize() throws Throwable{
        System.out.println("obj is destroyed");
    }

}