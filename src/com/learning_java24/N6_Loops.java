package com.learning_java24;
import java.util.Scanner;
public class N6_Loops{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n values: ");
        int n = sc.nextInt();


        // For Loop

//        for(int i=1;i<=n;i++){
//            System.out.println("Hello world!!!");

        // While loop

//            int i=1;
//            while(i <= n){
//                System.out.println("Hello luv <3");
//                i++;
//            }

        /* When to use while or for loop
            use for loop when you are sure how many times loop will run
            use while loop when you are not sure how many times loop will run
         */

        // Do while loop
        int i = 1;
        do{
            System.out.println("hello world!!!!!");
            i++;
        }while(i<=n);

    }

}