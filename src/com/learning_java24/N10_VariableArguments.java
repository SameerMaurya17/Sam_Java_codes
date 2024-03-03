package com.learning_java24;
import java.util.Arrays;

public class N10_VariableArguments {

    public static void main(String[] args){

    fun(1,2,3,4,5,6,7);
    multiple(3,4,"Sameer","Deku");

    }
    // Used when we are not sure how many things to pass
    static void fun(int ...z){
        System.out.println(Arrays.toString(z));
    }
    // For multiple data types (Make sure to always use ...x at the end
    static void multiple(int a, int b, String ...s){
       System.out.println(Arrays.toString(s));
    }

}
