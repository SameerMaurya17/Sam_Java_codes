package com.practice.LinkedListQuestions;
public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);

//        list.display();
//        list.removeDuplicates();
//        list.display();
//        System.out.println(list.hasCycle(list));
//        System.out.println(list.middleNode(list));

        LL list1 = new LL();

        for (int i = 7; i > 0; i--) {
            list1.insertLast(i);
        }

        list1.display();
        list1.bubbleSort();
        list1.display();


    }

}
