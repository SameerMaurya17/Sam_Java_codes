package com.practice.Recursion.Level1_Questions;

public class Q4_ReverseANumber {

    public static void main(String[] args) {

        int n = 1234;
//        System.out.println((int)Math.log10(n)); // To get how many digits are present in a number
        System.out.println(reverse(n));

    }

    // Sometimes you might need some additional variables in arguments
    // in that case, make another function
    public static int reverse(int n) {
        int power = (int)(Math.log10(n) + 1);
        // making a helper for providing a new argument power
        return helper(n,power);
    }

    public static int helper(int n, int power) {
        if(n % 10 == n){
            return n;
        }
        return n % 10 * (int) Math.pow(10,power - 1) + helper(n / 10, power -1);
    }

}
