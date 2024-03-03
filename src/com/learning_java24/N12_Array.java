package com.learning_java24;
import java.util.Scanner;
import java.util.Arrays;

public class N12_Array {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Arrays in java

        /*
        Syntax:
        datatype[] variable = new datatype[size];
         */

        //int[] arr1 = new int[5] ;
        //or directly
//        //int[] arr2 = {1,2,3,4,5};
//
//        int[] arr; // (Declaration), arr is getting defined in the stack
//        arr = new int[5];// (Initialisation), here actual object is being created in memory. (heap)
//        arr = new int[]{1, 2, 3, 4, 5};

//        String[] strArr = new String[5];
//
//        System.out.println(strArr[2]);

        // Taking inputs in array

        // Primitive types array

//        int[] arr = new int[5];
//
//        for(int i = 0;i<5;i++){
//            arr[i] = sc.nextInt();
//        }

        //Printing the array
        // Method 1) Using for loop

//        for(int i = 0; i < arr.length; i++) {  // here using .length to find the length of the array instead of using 5
//            System.out.print(arr[i] + " ");
//        }

        // Method 2) Using Enhanced for loop

//        for(int sameer: arr){
//            System.out.print(sameer+" ");
//        }

        // Method 3) .toString method

//          System.out.println(Arrays.toString(arr));  // Array is a class and .toString converts array to string
        

        // Non Primitives type array

//        String[] arr = new String[4];

//        for(int i = 0;i<4;i++){
//            arr[i]  = sc.nextLine();
//        }
//
//        System.out.println(Arrays.toString(arr));

        // Modify

//        arr[3] = "I miss us";
//        System.out.println(Arrays.toString(arr));

        // Array passing in function

//        int[] arr = new int[5];
//
//        arr = new int[]{1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));
//        Change(arr);
//        System.out.println(Arrays.toString(arr));

    }

    static void Change(int[] arr){
        arr[0] = 99;
    }

}
