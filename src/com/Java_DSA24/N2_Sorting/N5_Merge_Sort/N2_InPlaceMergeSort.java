package com.Java_DSA24.N2_Sorting.N5_Merge_Sort;

import java.util.Arrays;
public class N2_InPlaceMergeSort {

    public static void main(String[] args) {

        int[] arr = {4,3,2,1};

        inPlaceMergeSort(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));

    }

    public static void inPlaceMergeSort(int[] arr,int s,int e) {

        if(e - s == 1){
            return;
        }

        int m = s + (e-s) / 2;

        inPlaceMergeSort(arr,s,m);
        inPlaceMergeSort(arr,m,e);

        mergeInPlace(arr,s,e);

    }

    public static void mergeInPlace(int[] arr, int s, int e){

        int[] mix = new int[e - s];

        int m = s + (e - s)/2;
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j < e){

            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0;l < mix.length;l++){
            arr[s+l] = mix[l];
        }

    }

}
