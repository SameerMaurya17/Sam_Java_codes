package com.practice.Recursion.Level1_Questions;

public class Q3_SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(12341));
//        System.out.println(sum(5));6

    }

    // sum of digits (1234 = 1+2+3+4 ans == 10)

    public static int sumOfDigits(int n){

        if(n%10 == n){
            return n;
        }
        return n % 10 + sumOfDigits(n/10);
//        return sumOfDigits(n/10) + n % 10;

        //For product of digits
//        return n % 10 * sumOfDigits(n/10);

    }

    // sum of n to 1
    public static int sum(int n){

        if(n == 1){
            return 1;
        }

        return n + sum(n - 1);

    }

}
