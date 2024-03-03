package com.learning_java24;
import java.util.Scanner;
import java.util.ArrayList;

public class N14_Array_List {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Array list is basic same as array, Syntax is different and it's capacity doesn't matter kinda we can give more values then capacity cause when it is half(or somewhat full) it will create a new array list of double it's own size and move all elements to it and delete the old one.

        // Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10); // ArrayList<(Enter the datatype of elements in array)> arrayName = Arraylist<(optional to write datatype)>(Enter the capacity of array);

        // Inputing values manually

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);

        // Printing values manually

        //System.out.println(list); // Basically is Arrays.toString(arr)
        //System.out.println(list.get(1)); // It's like arr[1] to print||get the index value

        // Inputing values Dynamically

        for (int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++){
            System.out.print(list.get(i)+" ");
        }

    }

}
