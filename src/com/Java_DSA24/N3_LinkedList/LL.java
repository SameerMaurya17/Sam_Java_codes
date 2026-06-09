package com.Java_DSA24.N3_LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void bubbleSort(){
        bubbleSort(size, 0); // // (size - 1) but not in my code
    }

    private void bubbleSort(int row, int col) {
        if(row == 0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    tail = first;
                    first.next = null;
                    second.next = first;
                    prev.next = second;
                }else{
                    Node prev = get(col - 1);
                    tail = first;
                    first.next = second.next;
                    second.next = first;
                    prev.next = second;
                }
            }
            bubbleSort(row, col + 1);
        }else{
            bubbleSort(row - 1 , 0);
        }

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
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

    // insert using recursion

    public void insertRec(int val, int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node newNode = new Node(val);
            newNode.next = node;
            size++;
            return newNode;
        }
        node.next = insertRec(val,index - 1, node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
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

    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 1);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        int val = get(index).value;
//        get(index - 1).next = get(index + 1);
        get(index - 1).next = get(index).next;

//        Node prev = get(index - 1);
//        int val = prev.next.value;
//
//        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value){
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

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "[" + value + "]";
        }
    }

}
