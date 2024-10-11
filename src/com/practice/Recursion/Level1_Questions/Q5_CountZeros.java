package com.practice.Recursion.Level1_Questions;

public class Q5_CountZeros {

    public static void main(String[] args) {

        int n = 100000020;

        System.out.println(CountZeros(n,0)); // can also create helper and pass argument 0

    }

    public static int CountZeros(int n, int count){

        if(n == 0){
            return count;
        }
        if(n % 10 == 0){
            return CountZeros(n/10,++count);
        }
        return CountZeros(n/10, count);
    }

}
