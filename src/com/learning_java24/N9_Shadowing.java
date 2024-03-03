package com.learning_java24;

public class N9_Shadowing {
        static int x = 100;//(known as class variable)   This will be shadowed by line 9 in main function block

        public static void main(String[] args){

            System.out.println(x);// (100)
            int x; // (Declaration) the class variable at line 4 will be shadowed by this
        //    System.out.println(x); //Error cause scope of this will begin when value is initialised
            x = 10; //(Initialisation)
            System.out.println(x); // Shadowing (10)
            fun(); // (100)

        }

        static void fun(){
            System.out.println(x);
        }

}
