package com.practice;
import java.util.Scanner;
import java.util.Arrays;

public class P10_MaxValueInArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many value you want to store:  ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Elements in array: ");

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = (MaxValue(arr));

        System.out.println("The Biggest value in array is: "+ max);

    }

    static int MaxValue(int[] arr){

        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

}
