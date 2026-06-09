package com.practice.Recursion.Strings;

import java.util.ArrayList;

public class Q5_Dice {

    public static void main(String[] args) {

//        dice("",4);

        ArrayList<String> list = diceRet("",4);
        System.out.println(list);

    }

    public static ArrayList<String> diceRet(String p, int target){

        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= target; i++){
            list.addAll(diceRet(p+i,target - i));
        }
        return  list;
    }

    public static void dice(String p, int target){

        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= target; i++){
            dice(p+i,target - i);
        }

    }

}
