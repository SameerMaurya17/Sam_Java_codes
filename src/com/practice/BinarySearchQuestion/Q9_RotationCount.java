package com.practice.BinarySearchQuestion;

public class Q9_RotationCount {

    public static void main(String[] args){

        int[] arr = {4,4,4,4,5,1,2,3,4};
//        System.out.println(FindPivot(arr));
        System.out.println(RotationCount(arr));

    }

    static int RotationCount(int[] arr) {

        int pivot = FindPivotForDoubleElement(arr);

        // Works without it cause -1 + 1 is also 0
//        if(pivot == -1){
//            return 0;
//        }

        return pivot + 1;

    }

    static int FindPivot(int[]arr){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] < arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    static int FindPivotForDoubleElement(int[]arr){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

//            if(arr[start] < arr[mid]){
//                start = mid + 1;
//            }else{
//                end = mid - 1;
//            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end -1 ]){
                    return end - 1;
                }
                end--;
            }
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

}
