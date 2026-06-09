package com.Java_DSA24.N3_LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        if(head.value == val){
            head = head.next;
            tail.next = head.next;
            return;
        }
        Node node = head;
        do{
            if(node.next.value == val){
                node.next = node.next.next;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
        }
        System.out.println("HEAD");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
