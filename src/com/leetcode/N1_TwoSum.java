package com.leetcode;

// https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

public class N1_TwoSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 8;

        System.out.println(Arrays.toString(TwoSum(arr,target)));

    }

    public static int[] TwoSum(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
