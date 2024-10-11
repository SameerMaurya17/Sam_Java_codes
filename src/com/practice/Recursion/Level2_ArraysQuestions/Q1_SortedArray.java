package com.practice.Recursion.Level2_ArraysQuestions;

public class Q1_SortedArray {

    public static void main(String[] args) {

        int[] arr = {1,3,4,4,6,7};

        System.out.println(sorted(arr,0));

    }

    public static boolean sorted(int[] arr, int index) {

        if(index == arr.length - 1){
            return true;
        }
        return arr[index] <= arr[index+1] && sorted(arr,index+1);
    }

}
