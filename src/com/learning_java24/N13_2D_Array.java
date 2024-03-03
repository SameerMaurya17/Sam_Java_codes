package com.learning_java24;
import java.util.Scanner;
import java.util.Arrays;

public class N13_2D_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array (Matrix)

        //int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; // Direct
          int[][] arr = new int[3][3]; // Declaration
//        arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //initialisation
//        System.out.println(arr[2][0]);

        // Inputs

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // Output

        // For loop method

//        for(int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//        }

        // .toString method

//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row])); // Make sure to put arr[row]
//        }

        // Using Enhanced for loop

        for (int[] n : arr){ // In this for loop we use datatype according to which type of element present in the variable (here in arr it is a 2d array which is a basically an array of an array, So we use int[] datatype here).

            System.out.println(Arrays.toString(n));

            System.out.println(Arrays.toString(n));

        }

    }

}
