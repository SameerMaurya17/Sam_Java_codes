package com.practice.LinkedListQuestions;

import java.util.List;

// Ques 9) https://leetcode.com/problems/sort-list/
public class MergeSort {

    public ListNode sortList(ListNode head){

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode Head = new ListNode();
        if(list1.val <= list2.val){
            Head = list1;
            list1 = list1.next;
        }else{
            Head = list2;
            list2 = list2.next;
        }
        ListNode Node = Head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                Node.next = list1;
                list1 = list1.next;
            }else{
                Node.next = list2;
                list2 = list2.next;
            }
            Node = Node.next;
        }
        if(list1 == null){
            Node.next = list2;
        }else{
            Node.next = list1;
        }
        return Head;
    }

    public ListNode getMid(ListNode head){

        ListNode midPrev = null;

        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "[" + val + "]" ;
        }
    }

}
