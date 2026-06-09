package com.learning_java24.N12_OOPs.N9_Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunctions {

    public static void main(String[] args) {

        Operation sum = (a,b) -> a + b; // Lamda Function
        Operation sub = (a,b) -> a - b;
        Operation mul = (a,b) -> a * b;

        System.out.println(operator(4,5,sum));
        System.out.println(operator(4,5,sub));
        System.out.println(operator(4,5,mul));

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

//        arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

        arr.forEach(fun);

    }

    private static int operator(int a, int b, Operation op){
        return op.operation(a,b);
    }

    interface Operation{
        int operation(int a, int b);
    }

}
