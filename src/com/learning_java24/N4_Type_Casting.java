package com.learning_java24;

public class N4_Type_Casting {

    public static void main(String[] args) {

        // Type Casting (Type casting is when you assign a value of one primitive data type to another type.)

        // Widening Casting (automatically) :- byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) :- double -> float -> long -> int -> char -> short -> byte


        // Example for Widening Casting
//        byte b = 50;
//        short s = 234;
//        char c = 'c';
//        int i = 32432;
//        long l = 423535345L;
//        float f = 34.43f;
//        double d = 4234.34343;
//        double result = (f * b) + (i / c) + (d * s);

        // float + integer + double = double
//
//        System.out.println((f * b) +" "+ (i / c) +" "+ (d * s));
//        System.out.println(result);

        //Narrowing Casting


        float f = 43.f;
        char c = 'A';
        int i = (int) (f + 2); // Manually Typecasting float into int by using (int)
        char c1 =(char) (c + 2); // Manually Typecasting int into char by using (char)

        System.out.println(c1);
        System.out.println(i);

    }

}
