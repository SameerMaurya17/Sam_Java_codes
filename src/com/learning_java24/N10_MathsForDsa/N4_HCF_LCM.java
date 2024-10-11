package com.learning_java24.N10_MathsForDsa;

public class N4_HCF_LCM {

    public static void main(String[] args) {

        int ans = LCM(4,18);

        System.out.println(ans);
    }

    public static int LCM(int a,int b){
        return a * b / HCF(a,b);
    }
    public static int HCF(int a, int b) {
        if(a == 0){
            return b;
        }
        //Euclidean algorithm
        return HCF(b%a,a);
    }


}
