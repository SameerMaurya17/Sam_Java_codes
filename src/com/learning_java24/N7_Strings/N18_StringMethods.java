package com.learning_java24.N7_Strings;

import java.util.Arrays;

public class N18_StringMethods {

    public static void main(String[] args){

        String name = "Sameer Maurya";

        // There are String Methods Explore them

        System.out.println(Arrays.toString(name.toCharArray())); // converts into char arr

        System.out.println(name.length()); // Tells the length of string (also counts the empty space)

        System.out.println(name.toLowerCase()); // creates a new object which will convert to a lowercase version of given string

        System.out.println(name.toUpperCase()); // creates a new object which will convert to an uppercase version of given string

        // Note :- we can also use methods like "sameer".method();
        System.out.println("   sameer    ".trim()); // Trims||Removes the empty space

        System.out.println(name.concat(" sam")); // concatenate||adds Strings

        System.out.println(name.indent(8)); // start (a line of text) or position (a block of text) further from the margin than the main part of the text.

    }

}
