package com.practice.BinarySearchQuestion;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//Need to find peak index (maximum value) of a mountain array

public class Q6_MountainArray {

    public static void main(String[] args){

        // given a mountain arr just like a mountain it has a peak which is also maximum value of the array
        int[] arr = {0,6,10,10,5,2};
        System.out.println(FindPeakIndex(arr));

    }

    // returning maximum value (peak index) of mountain array
    static int FindPeakIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start != end){

            int mid = start + (end - start) / 2;

            /*
                when mid element is less than next element
                meaning, that this is increasing side of the mountain array
                and max element lies ahead
                hence,we are changing your start to mid + 1
                cause there's no way that max element will be behind of mid element
                and we also know that mid + 1 element is greater than mid element so no point on changing start = mid
                hence we did start  = mid + 1;
             */
            if(arr[mid]<arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
            /*
                in the else part, it is checking if mid element is greater than the next element or equal to next element
                and changing it to end = mid;
                cause there's no way the maximum element will be ahead of that
                cause we are on the decreasing side of the mountain array
                hence, we did end = mid;
             */

        }
        // in the end start and end will only point to one element and that will be maximum element
        // and we can return start or end cause they are equal

        return start;
    }

}
