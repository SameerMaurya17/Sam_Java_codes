package com.learning_java24.N8_Recursion;

public class N19_Recursion {

    public static void main(String[] args){

        text(1);

    }

    static void text(int n){

        // Base Condition (to stop () call)
        if(n == 5){
            System.out.println("Hello Luv \uD83E\uDEF6\uD83C\uDFFB");
            return;
        }

        System.out.println("Hello Luv \uD83E\uDEF6\uD83C\uDFFB");
        // if you are call a () again and again, you can treat it as a separate call in the stack
        // Tail recursion (cause this is the last statement in this recursion call)
        text(n + 1); // function calling itself
    }

}
