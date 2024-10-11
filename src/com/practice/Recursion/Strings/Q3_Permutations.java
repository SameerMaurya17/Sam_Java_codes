package com.practice.Recursion.Strings;

import java.util.ArrayList;

public class Q3_Permutations {

    public static void main(String[] args) {

//        purmutation("","abc");
        int ans = purmutationCount("","abc");
//        ArrayList<String> ans = purmutationList("","abc");
        System.out.println(ans);

    }

    public static int purmutationCount(String p, String str){

        if(str.isEmpty()){
          return 1;
        }

        int count = 0;
        char ch = str.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            count = count + purmutationCount(s+ch+e,str.substring(1));
        }
        return count;
    }

    // Returning an arraylist containing all the possible permutation of a given string

    public static ArrayList<String> purmutationList(String p, String str){

        if(str.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();
        char ch = str.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            list.addAll(purmutationList(s+ch+e,str.substring(1)));
        }
        return list;
    }

    // Printing all the possible permutation of a given string
    public static void purmutation(String p, String str){

        if(str.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = str.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            purmutation(s+ch+e,str.substring(1));
        }

    }

}
