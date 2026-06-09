package com.Java_DSA24.N4_Stacks_n_Queues.Questions;

import java.util.Stack;

public class QueueUsingStackRemove {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemove(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        second.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int remove(){
        return first.pop();
    }

    public int peek(){
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
