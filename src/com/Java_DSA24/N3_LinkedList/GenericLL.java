package com.Java_DSA24.N3_LinkedList;

public class GenericLL<t> {

    private Node head;
    private Node tail;

    private int size;

    public GenericLL() {
        this.size = 0;
    }

    public void insertFirst(t val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(t val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(t val, int index){
        if(size == 0){
            insertFirst(val);
            return;
        }
        if(size == index){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = new Node(val, temp.next); // this is shortcut for the code below
//        Node node = new Node(val, temp.next);
//        temp.next = node;

        size++;
    }

    public t deleteFirst(){
        t val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

//    public int deleteLast(){
//        int val = tail.value;
//        if(tail == head){
//            tail = head = null;
//            size--;
//            return val;
//        }
//        Node temp = head;
//        while(temp.next != tail){
//            temp = temp.next;
//        }
//        tail = temp;
//        tail.next = null;
//        size--;
//        return val;
//    }

    public t deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 1);
        t val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public t delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        t val = get(index).value;
//        get(index - 1).next = get(index + 1);
        get(index - 1).next = get(index).next;

//        Node prev = get(index - 1);
//        int val = prev.next.value;
//
//        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(t value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {

        private t value;
        private Node next;

        public Node(t value) {
            this.value = value;
        }

        public Node(t value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "[" + value + "]";
        }
    }

}
