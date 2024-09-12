package com.practice.BinarySearchQuestion;

public class Q2_FloorOfANumber {

    public static void main(String[] args) {

        int[] arr = {2,3,4,6,7,8};
        int target = 1;
        System.out.println(Floor(arr,target));
    }

    // Returning index of no. which is largest no. that is smaller or equal to (<=) target
     static int Floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        if(target < arr[start]){
            return -1;
        }

        boolean checker = arr[start]<arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(checker){

                if(target<arr[mid]){
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
        return end;
    }

}
