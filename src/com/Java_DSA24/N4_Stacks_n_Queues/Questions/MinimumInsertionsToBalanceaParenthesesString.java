package com.Java_DSA24.N4_Stacks_n_Queues.Questions;

import java.util.Stack;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumInsertionsToBalanceaParenthesesString {
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push('(');
            }else{
                if(i + 1 < s.length() && s.charAt(i+1) == ')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        count++;
                    }
                    i++;
                } else{
                    if(!stack.isEmpty()){
                        stack.pop();
                        count ++;
                    }else{
                        count += 2;
                    }
                }
            }
        }

        return stack.size() * 2 + count;
    }

    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(minInsertions(s));
    }

}
