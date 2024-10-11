package com.sam;

import java.util.Arrays;

public class kajfsldk {

    public static void main(String[] args) {

        int[] arr = {0,4,0};
        String str = "sameer";

        System.out.println(Arrays.toString(productExceptSelf(arr)));
//            Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(largestSumAfterKNegations1(arr,2));

    }

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;
        boolean inticator = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                inticator = false;
                count++;
                continue;
            }
            product *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
               if(count == nums.length || count > 1){
                   nums[i] = 0;
               }else {
                   nums[i] = product;
               }
            } else if (inticator) {
                nums[i] = product / nums[i];
            }else {
                nums[i] = 0;
            }
        }
        return nums;
    }
}