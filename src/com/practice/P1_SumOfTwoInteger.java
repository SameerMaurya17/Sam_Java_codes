package com.practice;
import java.util.Scanner;
public class P1_SumOfTwoInteger{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("The sum of "+a+" + "+b+" is : "+(a+b));

    }

}