package com.learning_java24.N7_Strings;

public class N16_Strings{

    public static void main(String[] args){

////     Strings are immutable(Not changing or unable to change)
//
//        String a = "sameer";
//        System.out.println(a);
//        a = "sameer maurya"; // here sameer obj is not being changed, it's creating a new obj sameer maurya in string pool inside head memory
//        System.out.println(a);

    // Comparison of Strings

        String a = "sameer"; // object name sameer is created inside string pool in heap memory
        String b = "sameer"; // b is also pointing to same object that a is pointing to sameer

        System.out.println(a == b); // checking if a and b both are pointing to same object
        System.out.println(a.equals(b)); // checking if a and b string have same values

        // using new keyword for creating new string object outside the string pool inside heap memory

        a = new String("sameer"); // new/original object name sameer is created
        b = new String("sameer"); // new/original object name sameer is created both are different objects

        System.out.println(a == b); // this gives false cause == is only checking if they both point to same objects not the actual values inside them
        System.out.println(a.equals(b)); // this will still give true cause it is checking the values of object

        

    }

}