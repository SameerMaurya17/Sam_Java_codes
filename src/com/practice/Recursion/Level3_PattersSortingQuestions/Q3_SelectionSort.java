package com.practice.Recursion.Level3_PattersSortingQuestions;

import java.util.Arrays;

public class Q3_SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4,3,2,1,6};

        sort(arr,0,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr,int max, int s, int e){

        if(e == 0){
            return;
        }
        if(s < e){
            if(arr[max] < arr[s+1]){
                max = s+1;
            }
            sort(arr,max,s+1,e);
        }else{
            int temp = arr[max];
            arr[max] = arr[e];
            arr[e] = temp;
            sort(arr,0,0,e-1);
        }

    }

}
