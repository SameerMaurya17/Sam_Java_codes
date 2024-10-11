package com.leetcode;
import java.util.Arrays;
//https://leetcode.com/problems/merge-sorted-array/
public class N3_MergeSortArray {

    public static void main(String[] args) {

        int[] nums1 = {0};
        int[] nums2 = {1};

        merge(nums1,0,nums2,1);

        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = Arrays.copyOfRange(nums1,0,m);

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){

            if(arr[i] <= nums2[j]){
                nums1[k] = arr[i];
                i++;
            }else{
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            nums1[k] = arr[i];
            i++;
            k++;
        }

        while(j < n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }

    }

}
