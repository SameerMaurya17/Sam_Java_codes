package com.learning_java24.N12_OOPs.N10_ExpectionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

//        int a = 5;
//        int b = 0;

        try {
//            int c = a / b;
//            divide(a,b);

            String name = "sameer";
            if(name.equals("sameer")){
                throw new MyExpection("name is sameer");
            }

        }catch (MyExpection e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Normal exception");
        }finally { // can only have one final block (Mostly used to close the resources) (and it always runs)
            System.out.println("This will always execute");
        }

        int num;
        // Try with Resource

        // In this case, i'm opening my resources in try and it'll automatically close it too, this is try with resource
        // This will only work with those classes who inherit AutoCloseable Class
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) //
        {
//    		InputStreamReader in =new InputStreamReader(System.in);
//    		BufferedReader br=new BufferedReader(in);
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally
        {
            //br.close();
        }

    }

    // Ducking the exception using throws meaning we are not solving the exception here but telling when you call this function it will throw an exceptions so hence solve it at that time
    public static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }

}
