package com.learning_java24.N7_Strings;
public class N17_StrBuilder {

    public static void main(String[] args){

//        // Problem with this method it's creating a new object every time
//        String series = "";
//
//        for (int i = 0; i < 26; i++) {
//        char ch = (char)('a' + i);
//        series = series + ch; // here everytime new string is being created (we can solve this Problem by using .append() of StringBuilder)
//        }
//
//        System.out.println(series);
//
//        // to solve this problem we can use StringBuilder Class
//
//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            builder.append(ch); // now it's modifying it, rather than creating a new object every time
//        }
//        System.out.println(build);

    // Exploring Stringbuilder

         StringBuilder builder = new StringBuilder("SameerMaurya");

         String name = "sameer";

//        System.out.println(builder.append(name)); // .append() it add to the end
        System.out.println(builder.reverse());
        System.out.println(builder.hashCode());


        // Explore more of the methods of StringBuilder Class

    }

}
