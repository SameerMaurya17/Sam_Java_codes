package com.practice.Recursion;

public class Q2_BinarySearchingUsingRecursion {

    public static void main(String[] args) {

        int[] arr = {1 ,2, 5, 6 ,7};
        int target = 5;
        System.out.println(BinarySearchUsingRecursion(arr, target, 0, arr.length - 1));

    }

    static int BinarySearchUsingRecursion(int[] arr, int target, int s, int e) {

        if(s > e){
            return -1;
        }

        int m = s + (e - s) / 2;

        if(arr[m] == target){
            return m;
        }

        if(arr[m] > target){
            return BinarySearchUsingRecursion(arr, target, s, m - 1);
        }

        return BinarySearchUsingRecursion(arr, target, m + 1, e);

    }

}
