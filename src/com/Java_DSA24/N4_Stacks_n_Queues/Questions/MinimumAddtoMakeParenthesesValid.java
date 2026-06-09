package com.Java_DSA24.N4_Stacks_n_Queues.Questions;

import java.util.Stack;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumAddtoMakeParenthesesValid {

    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }

        return stack.size();
    }

}
