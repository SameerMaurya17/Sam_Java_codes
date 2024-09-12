package com.Java_DSA24.N1_Searching.N2_Binary_Search;

import java.util.Arrays;

public class N3_2D_Binary_Search {

    public static void main(String[] args){

        int matrix[][] = {
                {10,20,30},
                {15,25,35},
                {21,31,41}
        };
        int target = 31;

        System.out.println(Arrays.toString(BinarySearchIn2DArray(matrix,target)));

    }

    static int[] BinarySearchIn2DArray(int[][] matrix, int target){

        int r = 0;
        int c = matrix.length - 1;

        //loop will run until row becomes more that matrix length and column into negative
        while(r < matrix.length && c >= 0){

            if(target == matrix[r][c]){
                // returning a new arr with indexes
                return new int[]{r,c};
            }
            if(target > matrix[r][c]){
                // if target is greater than matrix[r][c] then row will be +1
                r++;
            }else{
                // if target is less than matrix[r][c] then col will be -1
                c--;
            }

        }
        // if target not found returning -1,-1 array
        return new int[]{-1,-1};
    }

}
