package com.learning_java24.N12_OOPs.N9_Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Student rahul = new Student(14,88.9f);
        Student amash = new Student(7,60.3f);
        Student pranav = new Student(5,80.5f);
        Student sameer = new Student(3,340.2f);
        Student aryan = new Student(35,45.8f);


        Student[] list = {rahul,amash,pranav,sameer,aryan};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

//        Arrays.sort(list, new Comparator<Student>() {  // can also do like this cause .sort can also contain new Comparator
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.rollNo - o2.rollNo); // make it - negative for decending order
//
//            }
//        });

        System.out.println(Arrays.toString(list));


//        if(amash < rahul){ // compiler doesn't know what values we are comparing of these objects
//            System.out.println("Rahul has more marks");
//        }

        if(amash.compareTo(rahul) < 0){
            System.out.println(amash.compareTo(rahul));
            System.out.println("Rahul has more marks");
        }

    }

}
