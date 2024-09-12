package com.sam;


import java.util.Arrays;

public class Research {

    public static void main(String[] args) {

        int[] a = {3,1};
        int x = 1;

        int ans = seachingInRange(a,x);

        System.out.println(ans);

    }

    static int seachingInRange(int[]nums, int target){

        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(nums[0] <= target){
            return binarySearch(nums,target,0,pivot - 1);
        }
        return binarySearch(nums,target,pivot + 1,nums.length - 1);

    }
    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if((mid + 1) < arr.length && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if((mid - 1) > 0 && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return -1;
    }
    static  int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return - 1;
    }

}
