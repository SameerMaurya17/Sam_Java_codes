package com.learning_java24.N14_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class N3_Sets {

    // Set only contains unique values meaning it will not have duplicate values

    public static void main(String[] args) {

        // There is also no get method in set because it remove the duplicate values and order is not sure that why i think it doesn't have any get method
//        Set<Integer> nums = new HashSet<>(); // HashSet it not store elements in sorted order it will do in i guess in random not sure about the order
        Set<Integer> nums =new TreeSet<Integer>(); // TreeSet stores elements in a sorted order

        nums.add(99);
        nums.add(5);
        nums.add(8);
        nums.add(6);
        nums.add(5);

        //nums.add("5");

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next()); // gives the next item in iteration

//    	for(int n:nums)
//    	{
//    		System.out.println(n);
//   	}


//        System.out.println(nums);

    }

}
