package com.practice.Recursion.Level1_Questions;

public class Q1_Nto1 {

    public static void main(String[] args){

//        Nto1(5);
//        System.out.println();
//        _1toN(5);
        Nto1_1toN(5);

    }

    public static void Nto1(int n) {

        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        Nto1(n - 1);
    }

    public static void _1toN(int n) {

        if(n == 0){
            return;
        }

        _1toN(n - 1);

        System.out.print(n + " ");
    }

    public static void Nto1_1toN(int n) {

        if(n == 0){
            return;
        }

        System.out.println(n);

        Nto1_1toN(n - 1);

        System.out.println(n);
    }

}
