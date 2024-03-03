package com.learning_java24;

public class N8_Scope {

    public static void main(String[] args){

    // Method Scope

//        int num1 = 2, num2 = 4;
//        swap(num1, num2);
//      //  System.out.println(a+" "+b); // Gives an error cause A and B scope is limited to the swap Function

    // Block Scope

//        int a = 5; // Initialising A
//        // Block
//        {
//        //    int a = 10; // (This will not work) A is already initialised outside the block in same method
//            a = 10; // (Updating) reassigning the origin ref variable to some other value
//            System.out.println(a);
//            int b = 20; // B value is initialised in this block, and will remain in this only
//            System.out.println(b);
//        }
//    //    b = 25;// (Can't do this) B is not initialised outside the block
//        System.out.println(a);
//    //    System.out.println(b); // Can't use B variable outside the block

    // Scope in for loop
//        int i = 0;
//        for(i=0;i<3;i++){
//            int a = 1;
//        }
//        System.out.println(i); // i value is 3 if it is initialised before the loop and if not it will not run
//      //  System.out.println(a);

    }

    // Method Scope

    static void swap( int a, int b){

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);

        // This change will only be valid in this function scope only.

    }

}
