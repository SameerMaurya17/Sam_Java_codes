package com.practice.Recursion.Level1_Questions;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class Q6_CountSteps {

    public static void main(String[] args) {

        int n = 8;

        System.out.println(numberOfSteps(n));

    }

    public static int numberOfSteps(int n) {
        return helper(n,0);
    }

    public static int helper(int n, int steps) {
        if(n == 0){
            return steps;
        }
        if(n % 2 == 0){
            return helper(n/2,++steps);
        }
        return helper(n-1,++steps);
    }
}
