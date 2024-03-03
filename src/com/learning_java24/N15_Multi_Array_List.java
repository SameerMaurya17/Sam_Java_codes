package com.learning_java24;
import java.util.Scanner;
import java.util.ArrayList;

public class N15_Multi_Array_List {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);

//        ArrayList<ArrayList> list;
//        list = new ArrayList<>(5);


        // Initialization
        for (int i = 0;i < 3; i++){
            list.add(new ArrayList<>(3));   // Creating the objects in array meaning creating arrays in array(list)
        }

        // Adding Elements

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt()); // Here list.get(i) gets the first row of matrix and . add(sc.nextInt()) function adds the first integer given by the user
            }
        }

        System.out.println(list); // Printing the Matrix
        System.out.println(list.get(0)); // Printing a particaully row of matrix

    }

}
