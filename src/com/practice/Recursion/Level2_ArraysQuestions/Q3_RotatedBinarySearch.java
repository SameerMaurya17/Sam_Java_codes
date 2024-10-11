package com.practice.Recursion.Level2_ArraysQuestions;

public class Q3_RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr = {6,7,8,1,2,3,4};
        int target = 3;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    public static int search(int[] arr, int target,int s ,int e) {

        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }

        if(arr[s] < arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return search(arr,target,s,m-1);
            }else{
                return search(arr,target,m+1,e);
            }
        }

        // we already know that start element is bigger than middle element, hence:-
        if(target >= arr[m] && target <= arr[e]){
            return search(arr,target,m+1,e);
        }

        return search(arr,target,s,m-1);
    }

}
