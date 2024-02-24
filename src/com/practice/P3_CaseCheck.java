package com.practice;
import java.util.Scanner;
public class P3_CaseCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q2) CaseCheck a char if it is upper or lower cased

        char c = sc.next().trim().charAt(0); // by sc.next() we will get a string of one word and by trim() we can remove blank spaces and with chatAt(0) we will get char  present at 0 index of string

//        String str = "     Sameer";
//        String str2 = "Deku";
//        System.out.println(str.trim());
//        System.out.println(str2.charAt(2));

        if(c >= 'A' && c <= 'Z'){
            System.out.println("UpperCase");
        }else{
            System.out.println("LowerCase");
        }

    }

}
