package com.sam;

import java.util.Scanner;

public class Teaching {

    public static void main(String[] agrs){

//        System.out.println();
//        sum(521,0);
//
//        int n = 221;
//        System.out.println(n / 10);

        System.out.println( 4 & 1);


    }

    public static void sum(int n,int count) {

        if(count == 5){
            return;
        }
        count++;
        System.out.println(n % 10);
        sum(n / 10,count);

        

    }

}
