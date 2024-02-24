package com.practice;
import java.util.Scanner;
public class P2_LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

// Q1) Finding the max int value  among 3 int

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);

        // Method 2 Theres a Math.max() fuction in java

//        int max = Math.max(c, Math.max(a,b));
//        System.out.println(max);

    }

}
