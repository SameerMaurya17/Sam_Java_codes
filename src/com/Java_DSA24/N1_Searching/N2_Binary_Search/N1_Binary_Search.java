package com.Java_DSA24.N1_Searching.N2_Binary_Search;

public class N1_Binary_Search{

    public static void main(String[] args){

        int[] arr = {-8,-4,-2,0,2,4,6,8,10,12};
        int target = -100;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    // Returning the index using Binary Search Algorithm
    // if element not found returning -1 index
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        // while start is less than
        while(start <= end){

            // Normal way (This may exceed the integer range
//            int mid = (start + end) /2;

            // Better way to find mid
            int mid = start + (end - start) / 2;

            // When target is smaller than value present at mid
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {  // When target is larger than value present at mid
                start = mid + 1;
            }else{
                return mid; // When target is equal to mid
            }

        }

        // Returning -1 when target is not present
        return -1;

    }

}
