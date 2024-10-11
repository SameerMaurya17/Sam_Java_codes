package com.learning_java24.N9_Operators;

public class BitwiseOperators {

    public static void main(String[] args){
        
    }


    //Ques 2) Find which numbers in array is not repeated twice using (^) XOR operator

    public static int ans(int[] arr){
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }


    // Ques 1) checking if number is odd or even with the help of (&) operator
    public static boolean isOdd(int n) {
        // as we know in binary form of a number like 011 (3) L.S.B least significant bit decides if the number going to be odd or even
        return (n & 1) == 1;
    }

}
