package com.sam;


import java.util.Arrays;

public class Research {



    public static void main(String[] args) {

//        Object[] arr = new Object[3];
//
//        arr[0] = 3;
//        arr[1] = "hello luv";
//
//        Research[] obj = new Research[5];
//
//        obj[0] = new Research();
//
//        System.out.println(obj[0]);

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0;i < nums1.length; i++){
            boolean flag = true;
            for(int j = 0;j < nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    for(int k = j;k < nums2.length; k++){
                        if(nums1[i] < nums2[k]){
                            nums1[i] = nums2[k];
                            flag = false;
                            break;
                        }
                    }
                    break;
                }
            }
            if(flag){
                nums1[i] = -1;
            }
        }
        return nums1;
    }

}
