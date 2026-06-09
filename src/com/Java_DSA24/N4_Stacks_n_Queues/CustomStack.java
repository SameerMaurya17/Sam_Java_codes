package com.Java_DSA24.N4_Stacks_n_Queues;

public class CustomStack {

    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int n) {
        this.data = new int[n];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!!");
//            throw new StackException("Stack is full!!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty!!!");
        }
//        int value = data[ptr];
//        ptr--;
//        return value;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Can't peek from an empty stack!!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

}
