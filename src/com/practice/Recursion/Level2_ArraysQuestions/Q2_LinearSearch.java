package com.practice.Recursion.Level2_ArraysQuestions;

import java.util.ArrayList;

public class Q2_LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 4;

//        System.out.println(findIndex(arr,target,0));
//        System.out.println(findIndexLast(arr,target,arr.length-1));
//        FindAllIndex(arr,target,0);
//        System.out.println(list1);

//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(FindAllIndex(arr,target,0,list));
        // or I can take answer in a another list
//        ArrayList<Integer> ans = FindAllIndex(arr,target,0,new ArrayList<>());
//        System.out.println(ans);

        // Creating ArrayList inside every function call, and returning all the value in every Arraylist of every function call

        System.out.println(FindAllIndex2(arr,target,0));

    }

    // Creating ArrayList inside every function call, and returning all the value in every Arraylist of every function call
    // Returning list without passing the argument
    public static ArrayList<Integer> FindAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        // getting all the ans from below function calls
        list.addAll(FindAllIndex2(arr,target,index+1));
        return list;
    }

    public static ArrayList<Integer> FindAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindAllIndex(arr,target,index+1,list);
    }

    static ArrayList<Integer> list1 = new ArrayList<>();

    //Using Arraylist for storing all the available index that has target value
    public static void FindAllIndex(int[] arr,int target,int index){

        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list1.add(index);
        }
        FindAllIndex(arr,target,index+1);
    }

    public static int findIndex(int[] arr,int target,int index){

        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }

    public static int findIndexLast(int[] arr,int target,int index){

        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexLast(arr,target,index-1);
    }

}
