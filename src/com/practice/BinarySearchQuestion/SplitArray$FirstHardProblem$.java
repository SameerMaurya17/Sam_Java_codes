package com.practice.BinarySearchQuestion;

//https://leetcode.com/problems/split-array-largest-sum/


// My First ever hard problem

import java.util.Arrays;

public class SplitArray$FirstHardProblem$ {

    public static void main(String[] args){

        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;

        int ans = SplitArray(arr,m);

        System.out.println(ans);

    }

    static int SplitArray(int[] arr, int m){

        if(m > arr.length){
            return -1;
        }

        int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();

        while(start <= end){

            int mid = start + (end - start)/ 2;

            int MinimizedLargestSum = FindingMinimizedLargestSum(arr, mid);

            if(MinimizedLargestSum > m){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }

    static int FindingMinimizedLargestSum(int[] arr, int Avg){

        int M = 1;
        int num = 0;

        for(int i = 0; i < arr.length; i++){

            if(Avg >= arr[i] + num){
                num += arr[i];
            }else{
                M++;
                num = arr[i];
            }

            // the reason why this if else didn't worded properly because i was using <= instead of < in this if case
            // it was wrong because it when it was equal it was suppose to if else block code but when i putted <= it became if block condition that's why it was not working properly

//            if(Avg <= arr[i] + num){
//                M++;
//                num = arr[i];
//            }else{
//                num += arr[i];
//            }

        }
        return M;

    }

}
