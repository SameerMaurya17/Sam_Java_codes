package com.Java_DSA24.N4_Stacks_n_Queues;

import com.learning_java24.N12_OOPs.N10_ExpectionHandling.MyExpection;

public class CustomQueue {

    protected int[] data;
    protected static final int DEFAULT_SIZE= 10;
    protected int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];

        // shift the elements to left
        for (int i = 1; i < end; i++) {
            data[i - 1]= data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
