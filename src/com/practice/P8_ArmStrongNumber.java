package com.practice;
import java.util.Scanner;

public class P8_ArmStrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();
//        System.out.println(ArmStrongNumber(n));

        for(int i = 0;i<n;i++){
            if(ArmStrongNumber(i)){
                System.out.println(i+" ");
            }
        }

    }

    static boolean ArmStrongNumber(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return sum == original;
        /*
         if(sum==original){
            return true;
        }
        return false;
        */
    }

}
