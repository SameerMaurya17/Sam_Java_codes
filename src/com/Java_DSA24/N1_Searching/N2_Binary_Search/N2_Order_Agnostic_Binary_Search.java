package com.Java_DSA24.N1_Searching.N2_Binary_Search;

public class N2_Order_Agnostic_Binary_Search {

    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5};
        int[] arr = {5,4,3,2,1};

        System.out.println(orderAgnosticBinarySearch(arr,2));

    }

    static int orderAgnosticBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;


        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }

        }

        return -1;

    }

}
