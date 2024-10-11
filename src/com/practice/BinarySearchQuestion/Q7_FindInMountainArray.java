package com.practice.BinarySearchQuestion;

//https://leetcode.com/problems/find-in-mountain-array/

public class Q7_FindInMountainArray {

    public static void main(String[] args){

        int[] arr = {0,1,2,4,2,1};
        int target = 3;

        System.out.println(search(arr,target));

    }

    static int search(int[] arr, int target){

        int peakIndex = FindPeakIndex(arr);

//        int first = BinarySearch(arr,target, 0,peakIndex);
//        int second = BinarySearch(arr,target, peakIndex, arr.length -1);
//        if(first != -1){
//            return first;
//        }
//        if(second != -1){
//            return second;
//        }
//        return - 1;

        // optimized way

        int firstTry = BinarySearch(arr,target,0,peakIndex);
        if(firstTry != -1){
            return firstTry;
        }
        // if not then return second try
        // notice here peakIndex + 1
        return BinarySearch(arr, target, peakIndex + 1,arr.length-1);
    }

    static int FindPeakIndex(int[] arr){

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

    static int BinarySearch(int[] arr, int target, int start , int end){

        boolean checker = arr[start]<arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(checker){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

}
