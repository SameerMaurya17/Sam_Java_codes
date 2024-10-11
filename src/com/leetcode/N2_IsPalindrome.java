package com.leetcode;

class N2_IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(0));
//        System.out.println(isPalindromeUsingString(1));
//        isPalindrome(12451);

    }

    public static boolean isPalindromeUsingString(int n) {
        
        StringBuilder str = new StringBuilder(String.valueOf(n));
//        String rev = String.valueOf(str);
        StringBuilder rev = new StringBuilder(str);
//        System.out.println(str);
//        String rev = String.valueOf(str.reverse());
//        System.out.println(str + " " + rev);
//        System.out.println(str.compareTo(rev.reverse()) == 0);
//        System.out.println(str + " " + rev);
//        System.out.println(str.reverse());
        return str.compareTo(rev.reverse()) == 0;
    }

    public static boolean isPalindrome(int n) {
        int number = n;
        int rev = 0;

        while(number > 0){
            rev *= 10;
            rev += number % 10;
            number /= 10;
        }
        return rev == n;
    }

}