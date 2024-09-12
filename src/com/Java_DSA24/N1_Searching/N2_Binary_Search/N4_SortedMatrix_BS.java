package com.Java_DSA24.N1_Searching.N2_Binary_Search;

import java.util.Arrays;

public class N4_SortedMatrix_BS {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 7;

        System.out.println(Arrays.toString(search(matrix,target)));

    }

    static int[] binarySearch(int[][] matrix, int target,int row, int cStart, int cEnd){

        while(cStart <= cEnd){

            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        if(col == 0){
            return new int[]{-1,-1};
        }
        if(row == 1){
            return binarySearch(matrix,target,0,0,col-1);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        while(rStart < (rEnd - 1)){

            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                    rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart + 1][cMid]== target){
            return new int[]{rStart + 1,cMid};
        }


        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix,target,rStart,0,cMid - 1);
        }
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]){
            return binarySearch(matrix,target,rStart,cMid + 1,col - 1);
        }
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix,target,rStart + 1,0,cMid - 1);
        }else{
            return binarySearch(matrix,target,rStart + 1,cMid + 1, col - 1);
        }

    }

}
