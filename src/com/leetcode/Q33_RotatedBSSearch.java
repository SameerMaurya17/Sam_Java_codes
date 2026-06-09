package com.leetcode;

public class Q33_RotatedBSSearch {

    public static int search(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;

        while(s <= e){

            int mid = s + (e - s) / 2;

//            if(arr[mid] == target){
//                return mid;
//            }
//            if(arr[mid + 1] == target){
//                return mid + 1;
//            }
//            if(arr[mid - 1] == target){
//                return mid - 1;
//            }

            if(arr[s] < arr[e]){
                return binarySearch(arr,s,e,target);
            }

            if(arr[s] < arr[mid] && arr[mid] > arr[e]){
                if(arr[mid] > target && arr[s] < target){
                    return binarySearch(arr,s,mid - 1,target);
                }else{
                    return binarySearch(arr,mid + 1,e,target);
                }
            }

            if(arr[s] > arr[mid] && arr[mid] < arr[e]){
                if(arr[mid] < target && target < arr[e]){
                    return binarySearch(arr,mid + 1, e, target);
                }else{
                    return binarySearch(arr,s, mid - 1,target);
                }
            }

        }

        return -1;
    }

    static int binarySearch(int[] arr,int start, int end, int target){

//        int start = 0;
//        int end = arr.length-1;

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

    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(search(arr,0));
    }

}
