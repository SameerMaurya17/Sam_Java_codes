package com.Java_DSA24.N2_Sorting.N4_Cycle_Sort;

import java.util.Arrays;

public class N1_Cyclic_Sort {

    public static void main(String[] args){

        int[] arr = {2,3,4,2,5,1};

        CyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void CyclicSort(int[] arr) {

        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }

        }

    }

}
