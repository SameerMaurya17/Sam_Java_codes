package com.practice.Recursion.Level3_PattersSortingQuestions;

public class Q1_Patters {

    public static void main(String[] args) {

//        triangle(4,0);
        triangle2(4,0);

    }

    // Making a triangle
    // In normal patter question we were using 2 loops, here in recursion we will take 2 arguments
    public static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(r > c){
            System.out.print("*");
            triangle(r,c+1);
        }else{
            System.out.println();
            triangle(r-1,0);
        }
    }

    public static void triangle2(int r, int c){
        if(r == 0){
            return;
        }
        if(r > c){
            triangle2(r,c+1);
            System.out.print("*");
        }else{
            triangle2(r-1,0);
            System.out.println();
        }
    }

}
