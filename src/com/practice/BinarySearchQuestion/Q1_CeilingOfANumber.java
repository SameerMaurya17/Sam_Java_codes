package com.practice.BinarySearchQuestion;

public class Q1_CeilingOfANumber {

   public static void main(String[] args){

       int[] arr = {1,2,3,4,6,7,8};
       int target = 5;
       System.out.println(Ceiling(arr,target));
   }

   // Return the index of no which is the smallest no. that is greater than or equal to (>=) target
   static int Ceiling(int[] arr, int target){

       int start = 0;
       int end = arr.length - 1;

       if(target > arr[end]){
           return -1;
       }

       boolean checker = arr[start] < arr[end];

       while (start <= end){

           int mid = start + (end-start)/2;

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
       return start;
   }

}
