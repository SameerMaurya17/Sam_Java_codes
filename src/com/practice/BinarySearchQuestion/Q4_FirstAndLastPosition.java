package com.practice.BinarySearchQuestion;

import java.util.Arrays;

public class Q4_FirstAndLastPosition {

    public static void main(String[] args){

        int[] arr = {1,2,4,5,3,3,3,3,4,5};
        int target = 3;

        System.out.println(Arrays.toString(searchRange(arr,target)));
//        System.out.println(FirstAndLastPosition(arr,target));

    }

// In this question an array is given in which we have to find a particular value (target) and returns the indexes of that number first and last occurrence of the number

    static int[] searchRange(int[] arr, int target ){

        int[] ans = {-1,-1};
        ans[0] = FirstAndLastPosition(arr,target,true);
        ans[1] = FirstAndLastPosition(arr,target,false);

        return ans;
    }

    static int FirstAndLastPosition(int[] arr, int target, boolean startEnd) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start<=end){

            int mid = start + (end - start)/2;


            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                ans = mid;
                if(startEnd){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }

        return ans;
    }

//     static int[] FirstAndLastPosition(int[] arr, int target) {
//
//        int start = 0;
//        int end = arr.length - 1;
//        int[] indexes = new int[2];
//
//        while(start<=end){
//
//            int mid = start + (end-start)/2;
//
//            if(target < arr[mid]){
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            }else{
//                indexes[0] = mid;
//                end = mid - 1;
//            }
//
//        }
//
//         start = 0;
//         end = arr.length - 1;
//         while(start<=end){
//
//             int mid = start + (end-start)/2;
//
//             if(target < arr[mid]){
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             }else{
//                 indexes[1] = mid;
//                 start = mid + 1;
//             }
//
//         }
//        return indexes;
//    }

}
