package com.Java_DSA24.N4_Stacks_n_Queues.Questions;

// https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.util.Stack;

public class LargestAreaHistogram {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();

        int max = 0;
        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax(stack, heights, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while(!stack.isEmpty()){
            max = getMax(stack, heights, max, i);
        }
        return max;
    }

    private int getMax(Stack<Integer> stack, int[] heights, int max, int i) {

        int area = 0;
        int popped = stack.pop();
        if (stack.isEmpty()) {
            area = heights[popped] * i;
        } else {
            area = heights[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);

    }

}
