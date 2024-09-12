package com.Java_DSA24.N1_Searching.N1_Linear_Search;
import org.w3c.dom.ranges.Range;

import java.util.Arrays;
import java.util.Collections;

public class N1_Linear_Search{

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        int target = 4;
////        int ans1 = LinearSearch1(arr,target);
//        int ans2 = LinearSearch2(arr,target);
//
////        System.out.println(ans1);
//        System.out.println(ans2);

//        String str = "Sameer";
//        char target = 'm';
//
//        System.out.println(SearchString(str,target));

//        // Converting str to charArray
//        System.out.println(str.toCharArray());
////         Printing the converted str charArray
//        System.out.println(Arrays.toString(str.toCharArray()));

//        // Seaching in Given range
//        System.out.println(RangedLinearSearch(arr,target,1, 3));

        // Returing the Minimun value in the array
        System.out.println(MinValue(arr));
    }

    // Returing the minimum value in the array

    static int MinValue(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
       return min;
    }

    // Seaching in a Given range

    static int RangedLinearSearch(int[] arr, int target, int start , int end){

        if(arr.length==0){
            return -1;
        }

        for(int index = start; index <= end; index++){
            // Checking every Element of arr of the given range if target (i.e 4) is present or not
            int element = arr[index];
            if(element == target){
                // returning the index of element which is equal to target (returning a value means ending the function)
                return index;
            }
        }
        // This line will be executed if all of the elements are not equal to target
        return -1;

    }

    // Searching in String

    static boolean SearchString(String str, char target){

        if(str.length() == 0){
            return false;
        }

        // Using for each loop

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

//        for (int i = 0; i < str.length(); i++) {
//
//            if(target == str.charAt(i)){
//                return true;
//            }
//
//        }

        return false;

    }

    // Searching in the array for a element and returning it
    static int LinearSearch2(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }

        // For each loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        // This line will be executed if all of the elements are not equal to target
        // Integer.MAX_VALUE will return an garbage value
        return Integer.MAX_VALUE;

    }


    // Searching in the array for a element and returning the index of it
    // If element not found returing -1 ( czo -1 index doesn't exist)

    static int LinearSearch1(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            // Checking every Element of arr if target (i.e 4) is present or not
            int element = arr[index];
            if(element == target){
                // returning the index of element which is equal to target (returning a value means ending the function)
                return index;
            }
        }
        // This line will be executed if all of the elements are not equal to target
        return -1;

    }

}