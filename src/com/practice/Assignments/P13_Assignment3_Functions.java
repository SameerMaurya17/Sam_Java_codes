package com.practice.Assignments;
import java.util.Scanner;

public class P13_Assignment3_Functions {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

// Ques1) Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

//        System.out.print("Enter Three numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int max = Maximum(a,b,c);
//        int min = Minimum(a,b,c);
//
//        System.out.print("The Max and Min numbers are: "+max+", "+min);

// Ques2) Define a program to find out whether a given number is even or odd.

//        System.out.print("Enter the value: ");
//        int n = sc.nextInt();
//        NcheckerOddEven(n);

// Ques3) A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        VoteChecker(age);

// Ques4) Write a program to print the sum of two numbers entered by user by defining your own method.
//        Sum2Number();

// Ques5) Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

//        System.out.print("Enter your marks(Out of 100): ");
//        int marks = sc.nextInt();
//        DisplayGrades(marks);

// Ques6) Write a program to print the factorial of a number by defining a method named 'Factorial' .Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-

//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.print(n+"! = "+Factorial(n));

// Ques7) Write a function to find if a number is a palindrome or not. Take number as parameter.
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.println(Palindrome(n));

// Ques8) Write a function to check if a given triplet is a Pythagorean triplet or not.

//        System.out.print("Enter three numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(PythagoreanTripletChecker(a,b,c));

// Ques9) Write a function that returns all prime numbers between two given numbers.
//        System.out.print("Enter two numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        //String ans = PrimeNumberBetween(a,b);
//        PrimeNumberBetween(a,b);

// Ques10) Write a function that returns the sum of first n natural numbers.

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = SumOfNaturalNumbers(n);
        System.out.println(sum);

    }

// Ques10) Write a function that returns the sum of first n natural numbers.

    static int SumOfNaturalNumbers(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

// Ques9) Write a function that returns all prime numbers between two given numbers.

    static void PrimeNumberBetween(int a, int b){

       for (int i = a; i<= b; i++){
           boolean checker = true;
           for(int j = 2; j<i; j++){
               if(i%j==0){
                   checker = false;
                   break;
               }
           }
           if(checker){
               System.out.println(i+" ");
           }
    }
}

// Ques8) Write a function to check if a given triplet is a Pythagorean triplet or not.

    static boolean PythagoreanTripletChecker(int a,int b,int c){
        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
            return true;
        }else{
            return false;
        }
    }

// Ques7) Write a function to find if a number is a palindrome or not. Take number as parameter.

    static boolean Palindrome(int n){
        int org = n;
        int rev=0,rem;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
            }
        if(org==rev){
            return true;
        }else{
            return false;
        }
    }

// Ques6) Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-

    static int Factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

// Ques5) Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

    static void DisplayGrades(int marks){
       switch(marks/10){
           case 10:
               System.out.println("You got perfect score");
               break;
           case 9:
               System.out.println("AA");
               break;
           case 8:
               System.out.println("AB");
               break;
           case 7:
               System.out.println("BB");
               break;
           case 6:
               System.out.println("BC");
               break;
           case 5:
               System.out.println("CD");
               break;
           case 4:
               System.out.println("DD");
               break;
           default:
               System.out.println("Fail");
               break;
       }

    }


// Ques4) Write a program to print the sum of two numbers entered by user by defining your own method.

    static void Sum2Number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a+b);
    }

// Ques3) A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

    static void VoteChecker(int age){
        if(age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

//Ques2) Define a program to find out whether a given number is even or odd.

    static void NcheckerOddEven(int n){
        if(n%2==0){
            System.out.println("Even");
        } else
        System.out.println("Odd");
    }

// Ques1) Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

    static int Maximum(int a, int b, int c){
        int max;
        if(a>b&&a>c){
            max = a;
        }
        else if(b>a&&b>c){
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }

    static int Minimum(int a, int b, int c){
        int min;
        if(a<b&&a<c){
            min = a;
        }
        else if(b<a&&b<c){
            min = b;
        }
        else{
            min = c;
        }
        return min;
    }

}