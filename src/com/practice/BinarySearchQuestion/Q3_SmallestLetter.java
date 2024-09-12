package com.practice.BinarySearchQuestion;

public class Q3_SmallestLetter {

    public static void main(String[] args) {

        char[] arr = {'a','b','c','e','f','g'};
        char target = 'g';

        System.out.println(SmallestLetter(arr,target));
    }

    static char SmallestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        // Notice how i used % operator to wrap around the array (when array index becomes equals to array length then index is changed to 0th index
        /*
        this is used because for example:
        2%4 = 2 reminder
        3%4 = 3 reminder
        4%4 = 0 reminder
         */
        return arr[start % arr.length];
    }

}
