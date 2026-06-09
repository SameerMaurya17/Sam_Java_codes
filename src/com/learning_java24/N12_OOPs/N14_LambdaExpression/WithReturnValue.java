package com.learning_java24.N12_OOPs.N14_LambdaExpression;

@FunctionalInterface // This is the annotation for the FunctionalInterface
interface B
{
    int add(int a, int b);
}

public class WithReturnValue {

    public static void main(String[] args) {

//        B obj = new B() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };

//        B obj = (a,b) -> {
//                return a+b;
//            };

        B obj = (int a, int b) -> a+b;


        System.out.println(obj.add(2,5));

    }

}
