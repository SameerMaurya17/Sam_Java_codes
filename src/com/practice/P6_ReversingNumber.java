package com.practice;

public class P6_ReversingNumber {

    public static void main(String[] args) {

        // Q5) Reversing Number

        int n = 12345;

        int ans = 0;

        while(n > 0){
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);

    }

}
