package com.practice;
import java.util.Scanner;
import java.util.Arrays;

public class P11_ReversingAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many value you want to store: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Elements in array: ");

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void ReverseOdd(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start != end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void ReverseEven(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start != end) {
            end--;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        }
    }



}
