package com.learning_java24;

import java.util.Scanner;
public class N3_Inputs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int num = input.nextInt();
        System.out.println("Enter a float: ");
        float decimal = input.nextFloat();
        System.out.println("Enter a double: ");
        double lagerDecimalNumber = input.nextDouble();
        System.out.println("Enter a long: ");
        long LargerInteger = input.nextLong();
        System.out.println("Enter a boolean: ");
        boolean check = input.nextBoolean();
        System.out.println("Enter a string: ");
        String str1 = input.next();
//        System.out.println("Enter a line: ");
//        String str2 = input.nextLine();

        System.out.println(num);
        System.out.println(decimal);
        System.out.println(lagerDecimalNumber);
        System.out.println(LargerInteger);
        System.out.println(check);
        System.out.println(str1);
//        System.out.println(str2);



    }

}