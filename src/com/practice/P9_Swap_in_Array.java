package com.practice;
import java.util.Scanner;
import java.util.Arrays;

public class P9_Swap_in_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    //    int[] arr = {1,2,3,4,5};

        int[] arr = new int[5];

        System.out.print("Enter the Elements in array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter which Elements you want to change with whom: ");
        int index1 = sc.nextInt() - 1;
        int index2 = sc.nextInt() - 1;

        System.out.println(Arrays.toString(arr));
        swap(arr, index1 , index2);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int  index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}
