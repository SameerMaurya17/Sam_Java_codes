package com.practice;

public class P16_Patters {

    public static void main(String[] args) {

        pattern7(5);

    }

    static void pattern7(int n){

        for (int i = 0; i < n; i++) {

            for (int j = 0 ; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern6(int n){

        for (int i = 0; i < n; i++) {

            for (int j = i ; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern5(int n){

        for (int i = 0; i < n ; i++) {

            if(i < n / 2){
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            }else{
                for (int j = i ; j < n; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    static void pattern4(int n){

        for (int i = 0; i <= n ; i++) {

            for (int j = 1 ; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){

        for (int i = 0; i < n ; i++) {

            for (int j = i ; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern2(int n){

        for (int i = 0; i < n ; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern1(int n){

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
