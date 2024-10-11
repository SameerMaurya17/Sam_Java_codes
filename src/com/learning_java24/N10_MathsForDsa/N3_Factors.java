package com.learning_java24.N10_MathsForDsa;

import java.util.ArrayList;

public class N3_Factors {

    public static void main(String[] args) {

        int n = 200;

        factor3(n);

    }

    // time & space both: O(sqrt(n))
    public static void factor3(int n){

        ArrayList<Integer>  list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }

    // time: O(sqrt(n))
    public static void factor2(int n){

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }

    }

    // time: O(n)
    public static void factor1(int n) {

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

    }

}
