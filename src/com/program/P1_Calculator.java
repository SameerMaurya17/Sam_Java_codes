package com.program;
import java.util.Scanner;
public class P1_Calculator{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float num1,num2;

        // result stores the result
        float result = 0F;

        while(true){

            // Enter the operations
            System.out.print("Enter which operation you want to perform. (Press 'X' or 'x' for exit): ");
            // op stores operation
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.print("Enter two numbers: ");
                num1 = sc.nextFloat();
                num2 = sc.nextFloat();

                if(op == '+'){
                    result = num1 + num2;
                }
                if(op == '-'){
                    result = num1 - num2;
                }
                if(op == '*'){
                    result = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0) {
                        result = num1 / num2;
                    }else{
                        System.out.println("Divisor value can't be zero");
                    }
                }
                if(op == '%'){
                    result = num1 % num2;
                }

                System.out.println(result);

            } else if(op == 'X' || op == 'x'){
                // Exiting the loop if X or x is pressed
                System.out.println("Exiting the Program <3");
                break;
            }else{
                System.out.println("Invalid Operation!!!");
            }

        }

    }

}