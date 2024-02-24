package com.practice;
import java.util.Scanner;
public class P4_Fibonacci_Series {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q3) Print Fibonacci Numbers

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println(a);
        System.out.println(b);

        for(int i=0;i<(n-2);i++) {

            c = a + b;
            a = b;
            b = c;
            System.out.println(c);

        }
    }

}
