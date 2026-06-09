package com.sam.CopyPaste;

import java.util.*;
class Solution {
    public static int findJudge(int n, int[][] trust) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] arr : trust){
            graph.get(arr[0]-1).add(arr[1]);
        }

        if(n == 1){
            if(graph.get(0).isEmpty()){
                return 1;
            }
        }


        ArrayList<Integer> list = new ArrayList<>();

        for(int[]arr : trust){
            if(!list.contains(arr[1])){
                list.add(arr[1]);
            }
        }

        int ans = 0;
        ArrayList<Boolean> checker = new ArrayList<>();
        for(int i = 0 ; i < list.size();i++){
            if(!graph.get(list.get(i)-1).isEmpty()){
                list.remove(i);
            }
        }
        for(int i = 0 ; i < list.size(); i++){
            for(int j = 0; j < n; j++){
                if(graph.get(j).contains(list.get(i))){
                    checker.add(true);
                }
                ans = list.get(i);
            }
            if(checker.size() == n - 1){
                return ans;
            }else{
                checker = new ArrayList<>();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] edges = {
//                {1,3},{1,4},{2,3},{2,4},{4,3}

//                {1,2},{1,3},{2,1},{2,3},{1,4},{4,3},{4,1}
                {1,2},{2,1}
        };
        System.out.println(
                findJudge(2,edges)
        );


//        List<List<Integer>> graph = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            graph.add(new ArrayList<>());
//        }
//        for (int[] edge : edges) {
//            graph.get(edge[0]-1).add(edge[1]);
//            graph.get(edge[1]-1).add(edge[0]);
//        }
//
//        System.out.println(graph);

//        for(List<Integer> L : graph){
//            System.out.println(L);
//        }

    }
}