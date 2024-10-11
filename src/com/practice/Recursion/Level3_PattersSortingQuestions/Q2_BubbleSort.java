package com.practice.Recursion.Level3_PattersSortingQuestions;

import java.util.Arrays;

public class Q2_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {4,3,2,1,6};

//        bubble(arr,0,arr.length-1);
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] arr, int s, int e){

        if(e == 0){
            return;
        }
        if(s < e){
            if(arr[s] > arr[s+1]){
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
            bubble(arr,s+1,e);
        }else{
            bubble(arr,0,e-1);
        }

    }

    public static void sort(int[] arr,int r, int c){
        if(r == 0){
            return;
        }
        if(r > c){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sort(arr,r,c+1);
        }else{
            sort(arr,r-1,0);
        }
    }

}
