package com.Java_DSA24.N2_Sorting.N6_Quick_Sort;

import java.util.Arrays;

public class N1_Quick_Sort {

    public static void main(String[] args) {
        int[] arr = {4,1,2,5,3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int hi){

        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int p = arr[m];

        while(s <= e){
            while(arr[s] < p){
                s++;
            }
            while(arr[e] > p){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hi);
    }

}
