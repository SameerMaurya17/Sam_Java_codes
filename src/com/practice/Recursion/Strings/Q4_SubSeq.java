package com.practice.Recursion.Strings;

import java.util.ArrayList;

public class Q4_SubSeq {

    public static void main(String[] args) {

//        pad("","12");
//        ArrayList<String> ans = padRet("","12");
//        System.out.println(ans);

        System.out.println(padCount("","12"));

    }

    public static int padCount(String p, String up){

        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            count = count + padCount(p+ch,up.substring(1));
        }
        return count;
    }

    public static ArrayList<String> padRet(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<String>();

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }

    public static void pad(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }

    }

}
