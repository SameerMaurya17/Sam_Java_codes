package com.practice.BinarySearchQuestion;


public class Q5_InfiniteArray {

    public static void main(String[] args){

        // Imagine if this array is infinite
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;

        System.out.println(FindingSearchRange(arr,target));
    }

    // Finding the start and end for binary search
    static int FindingSearchRange(int[] arr,int target){
    // taking initially start and end
        int start = 0;
        int end = 1;
    // double the start and end everytime until the target is between that start and end array
        while(arr[end] < target){
            // start will be + 1 index from the end
            int temp = end + 1;
            // end will be end + size of box * 2 (size of box will be end box - end of start box)
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        // returning the binary search performed on new start and end
        return binarySearch(arr,target,start,end);

    }

    static int binarySearch(int[] arr,int target,int start, int end){

        while(start<=end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
