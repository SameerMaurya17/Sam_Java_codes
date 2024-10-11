package com.practice.Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_SubSetProbs {

    public static void main(String[] args) {

        int[] arr = {1,2,2};
        String str = "abc";

        List<List<Integer>> ans = subsetDuplicate(arr);
//        List<List<Integer>> ans = subset(arr);
//        ArrayList<String> ans = subsetAscii("",str);
        System.out.println(ans);

    }

    // Using iterative method for returing List of subsets of a given array even if it contains duplicates values
    public static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    // Using iterative method for returing List of subsets of a given array

    public static List<List<Integer>> subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    // returing an arraylist containing all the subsets and ascii value of char of given string
    public static ArrayList<String> subsetAscii(String p, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsetAscii(p+ch, str.substring(1));
        ArrayList<String> ascii = subsetAscii(p+(ch+0), str.substring(1));
        ArrayList<String> right = subsetAscii(p, str.substring(1));

        left.addAll(right);
        left.addAll(ascii);
        return left;
    }

    // returing an arraylist containing all the subsets of given string
    public static ArrayList<String> subsetRet(String p, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsetRet(p+ch, str.substring(1));
        ArrayList<String> right = subsetRet(p, str.substring(1));

        left.addAll(right);
        return left;
    }

    // printing subsets of the given string
    public static void subset(String p ,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        subset(p+ch, str.substring(1));
        subset(p, str.substring(1));
    }

}
