package com.practice;
import java.util.Scanner;
public class P7_PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean ans = primenumber(n);
        System.out.println(ans);

    }

    static boolean primenumber(int n) {
        if(n==1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }

}
