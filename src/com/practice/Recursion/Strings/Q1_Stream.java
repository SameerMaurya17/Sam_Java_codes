package com.practice.Recursion.Strings;
public class Q1_Stream {

    public static void main(String[] args) {

        String str = "sameer";
        String str2 = "sameer maurya";

        SkipingAchar(str,"");
        SkipingAStr(str,"");
        SkipingStrIfNotRequired(str,"");
        SkipingStrIfNotRequired(str2,"");

    }

    // Skipping a string if it's not the required string

    public static void SkipingStrIfNotRequired(String str, String p) {

        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        if(str.startsWith("eer") && !str.startsWith("eer maurya")){
            SkipingStrIfNotRequired(str.substring(3),p);
        }else{
            SkipingStrIfNotRequired(str.substring(1),p+ch);
        }
    }

    // Skipping a String from a character
    public static void SkipingAStr(String str, String p) {

        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        if(str.startsWith("eer")){
            SkipingAStr(str.substring(3),p);
        }else{
            SkipingAStr(str.substring(1),p+ch);
        }
    }

    // Skipping a character from a string
    public static void SkipingAchar(String str, String p) {

        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        if(str.charAt(0) == 'e'){
            SkipingAchar(str.substring(1),p);
        }else{
            SkipingAchar(str.substring(1),p+ch);
        }
    }

}
