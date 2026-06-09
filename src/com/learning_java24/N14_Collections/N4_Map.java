package com.learning_java24.N14_Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class N4_Map {

    public static void main(String[] args) {

//        Map<String,Integer> students = new HashMap<>(); // The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.
        Map<String, Integer> students=new Hashtable<>();

        // HashMap and Hashtable is almost same the main difference is that HashTable is used for synchronized

        students.put("Navin",56);
        students.put("Harsh",23);
        students.put("Sushil",67);
        students.put("Kiran",92);
        students.put("Harsh",45);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }

    }

}
