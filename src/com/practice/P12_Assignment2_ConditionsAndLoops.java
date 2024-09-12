package com.practice;
import java.util.Scanner;

public class P12_Assignment2_ConditionsAndLoops {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//Ques1) Subtract the Product and Sum of Digits of an Integer

//        System.out.print("Enter and ingeter: ");
//        int n = sc.nextInt();
//        int sub = SubOfProAndSum(n);
//        System.out.println(sub);

// Ques2) Input a number and print all the factors of that number (use loops).

//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.print("The factorial of the "+n+" are: ");
//        Factors(n);

//Ques3) Take integer inputs till the user enters 0 and print the largest number from all.

    }

    static void Factors(int n){

// Ques2) Input a number and print all the factors of that number (use loops).

//        System.out.print("The factorial of "+n+" is: ");
//        for (int i = 0;i<n;i++){
//            for (int j=0;j*j<n;j++){
//                if(i*j==n){
//                    System.out.print(j+" "+i+" ");
//                }
//            }
//        }
//        System.out.println(1+" "+n);

        for (int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(n);
    }

    static int SubOfProAndSum(int n){

//Ques1) Subtract the Product and Sum of Digits of an Integer

        int rem,sum=0,multi=1;

        while(n>0){

            rem = n%10;
            sum = rem+sum;
            multi = rem*multi;

            n/=10;
        }
        int sub = multi - sum;
        //System.out.println(sum);
        //System.out.println(sub);
        //System.out.println(multi);

    //    System.out.println("The Subtraction of Product and Sum of Digits of and Integer is: "+sub);
        return sub;
    }

}
