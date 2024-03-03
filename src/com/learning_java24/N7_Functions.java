package com.learning_java24;
import java.util.Scanner;

public class N7_Functions {

    public static void main(String[] args){

        /*
        Function with no arguments and no return value.
        Function with no arguments and a return value.
        Function with arguments and no return value.
        Function with arguments and with return value.
         */

        // Function in java
//      greeting();

        // Function returning a value
//      int sum = sum();
//      System.out.println("The sum of A and B is: " + sum);

        // Another example of it
//        String name = Name();
//        System.out.println("Hello "+name+" ,Good Morning :)");

        // Function with parameter and arguments

//        int sum1 = sum1(4,6); // These 4 and 6 are arguments
//        System.out.println(sum1);


        
    }

    // Functions in java
    static void greeting(){
        System.out.println("Hello, luv 🫶🏻🫶🏻");
    }

    // Function returning a value
    static int sum(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        return sum;

    }

    // Another example returning a string this time

    static String Name(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        return name;

    }

    // Function with parameter and arguments

    static int sum1(int a,int b) { // here a and b are parameters
        int sum1 = a + b;
        return sum1;
    }

}
