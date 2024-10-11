package com.practice.Assignments;

import java.util.Scanner;
public class P17_Fibonacci {

    public static void main(String[] args) {

        // Find Fibonacci numbers

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter which index fibonacci number you want : ");
        int n = sc.nextInt();

        System.out.print("Fibonacci number is: " + FibonacciFormula(n));

    }

    static long FibonacciFormula(int n){

        return (long) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
        // removing less dominating term
//        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));

    }
    static int Fibonacci(int n){

        // if n == 0 it will return 0, if n == 1 it will return 1
        if(n < 2){
            return n;
        }

        return Fibonacci(n-1) + Fibonacci(n-2);

    }

}
