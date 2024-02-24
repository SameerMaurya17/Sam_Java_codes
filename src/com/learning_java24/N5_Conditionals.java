package com.learning_java24;

public class N5_Conditionals {

    public static void main(String[] args){

    // If statement

//        int a = 5;
//
//        if(a==5){
//            System.out.println("The value of a is: 5");
//        }

    // If-else statement

//        int a = 3;
//        int b = 4;
//
//        if(a<b){
//            System.out.println("B is bigger than A");
//        } else{
//            System.out.println("A is bigger than B");
//        }

        // If-else-if ladder
//        int a = 4;
//        int b = 4;
//
//        if(a<b){
//            System.out.println("B is bigger than A");
//        }else if(a==b){
//            System.out.println("A and B are same");
//        } else{
//            System.out.println("A is bigger than B");
//        }

        // Nested if statement

        int age=20;
        int weight=80;

        if(age >= 18) {

            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }
    }

}
