package com.Java_DSA24.N2_Sorting.N2_Selection_Sort;

import java.util.Arrays;

public class N1_Selection_Sort {

    public static void main(String[] args){

        int[] arr = {65,5,4,3,2,1};
        SelectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void SelectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = findMax(arr,0,last);
            swap(arr,max,last);
        }

    }

    static void swap(int[] arr,int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    static int findMax(int[] arr, int start, int last) {
        int max = 0;
        for(int i = start; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

//    static void SelectionSort(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int last = arr.length - i - 1;
//            int max = 0;
//
//            for(int j = 0; j <= last; j++){
//                if(arr[max] < arr[j]){
//                    max = j;
//                }
//            }
//            int temp = arr[last];
//            arr[last] = arr[max];
//            arr[max] = temp;
//        }
//    }

}
