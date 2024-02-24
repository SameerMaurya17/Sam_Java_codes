package com.practice;

public class P5_CountingOccurrences {

    public static void main(String[] args) {

        // Q4) Counting Occurrences

        int n = 127776787;
        int rem;
        int count = 0;

        while(n>0){

           rem = n%10;
           if(rem==7){
               count++;
           }
           n /= 10;

        }
        System.out.println(count);


    }

}
