package com.practice.BinarySearchQuestion;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

public class Q8_RotatedBinarySearch {

    public static void main(String[] args){

        int[] arr = {2,2,2,2,2,2,2,2,9,2,2,2};
        int target = 2;

        System.out.println(findPivotWithDuplicates(arr));

    }

    static int Answer(int[] arr,int target){

        int pivot = findPivot(arr);

        if(pivot == -1){
            return binarySearch(arr,target,0, arr.length-1);
        }
        if(arr[pivot] == target){
          return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);

    }

    //returning the index of Privot (maximum element)
    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start <=end){

            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;

    }

    static int findPivotWithDuplicates(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start <=end){

            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //there's a chance that start could be pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                //there's a chance that end could be pivot
                if(arr[end]<arr[end-1]){
                    return end - 1;
                }
                end--;
            }
//            if(arr[mid] < arr[start]){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }

            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }

        }
        return -1;

    }

    static int binarySearch(int[] arr, int target, int start ,int end){
        boolean checker = arr[start]<arr[end];
        while(start <= end){
            int mid = start + (end - start )/2;

            if(target == arr[mid]){
                return mid;
            }

            if(checker){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
