package com.practice.Recursion.Level1_Questions;

public class Q2_Factorial {

    public static void main(String[] args) {

        System.out.println(fact(3));

    }

    public static int fact(int n) {

        if(n == 1){
            return 1;
        }

        return n * fact(n - 1);
    }

}
