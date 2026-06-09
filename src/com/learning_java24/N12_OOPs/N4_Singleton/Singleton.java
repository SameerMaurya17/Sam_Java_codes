package com.learning_java24.N12_OOPs.N4_Singleton;

public class Singleton {

    private Singleton(){

    }

    private static Singleton obj;

    public static Singleton getObj(){

        // Checks weather 1 obj only is created or not
        if(obj == null){
            obj = new Singleton();
        }

        return obj;
    }

}
