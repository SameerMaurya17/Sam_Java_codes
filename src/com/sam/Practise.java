package com.sam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practise{

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(4);
        list2.add(4);



        System.out.println(list.contains(4));
        System.out.println(list.get(0) == list2.get(0));


        int[][] matrix = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int target = 70;

        System.out.println(Arrays.toString(search(matrix,target)));

    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd){

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

    static int[] search(int[][] matrix, int target){

        int row = matrix.length;
        int col = matrix[0].length;

        if(row == 1){
            return binarySearch(matrix,target,0,0,col - 1);
        }
        if(col == 0){
            return new int[]{-1,-1};
        }

        int rStart = 0;
        int rEnd = row - 1;
        int mid = col / 2;

        while(rStart < (rEnd - 1)){

            int rMid = rStart + (rEnd - rStart) / 2;

            if(matrix[rMid][mid] == target){
                return new int[]{rMid,mid};
            }
            if(matrix[rMid][mid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        if(matrix[rStart][mid] == target){
            return new int[]{rStart, mid};
        }
        if(matrix[rStart + 1][mid] == target){
            return new int[]{rStart + 1, mid};
        }

        if(matrix[rStart][mid - 1] >= target){
            return binarySearch(matrix,target,rStart,0,mid - 1);
        }
        if(matrix[rStart][mid + 1] <= target && target <= matrix[rStart][col - 1]){
            return binarySearch(matrix,target,rStart,mid + 1,col - 1);
        }
        if(matrix[rStart + 1][mid - 1] >= target){
            return binarySearch(matrix, target, rStart + 1, 0, mid - 1);
        }else{
            return binarySearch(matrix,target,rStart + 1, mid + 1, col - 1);
        }

    }

    }