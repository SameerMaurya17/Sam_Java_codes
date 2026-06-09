package com.practice.LinkedListQuestions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {

    // https://leetcode.com/problems/add-two-numbers/?envType=problem-list-v2&envId=vhze33gh
    public ListNodee addTwoNumbers(ListNodee l1, ListNodee l2) {
        int sum = 0;

        ListNodee list = new ListNodee(-1);
        ListNodee head = list;

        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + sum;
            int digit = sum %10;
            sum /= 10;
            if(list.val == -1){
                list.val = digit;
            }else{
                ListNodee temp = new ListNodee(digit);
                list.next = temp;
                list = list.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            sum += l1.val;
            int digit = sum %10;
            sum /= 10;
            ListNodee temp = new ListNodee(digit);
            list.next = temp;
            list = list.next;
            l1 = l1.next;
        }
        while(l2 != null){
            sum += l2.val;
            int digit = sum %10;
            sum /= 10;
            ListNodee temp = new ListNodee(digit);
            list.next = temp;
            list = list.next;
            l2 = l2.next;
        }
        if(sum > 0){
            ListNodee temp = new ListNodee(sum);
            list.next = temp;
        }
        return head;
    }

    // Ques 2) https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            boolean check = true;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == n){
                    check = false;
                    break;
                }
            }
            if(check){
                list.add(n);
            }
            n--;
        }
        return list;
    }

    // Ques 1) https://leetcode.com/problems/remove-linked-list-elements/description/
    public ListNodee removeElements(ListNodee head, int val) {
        if(head == null){
            return head;
        }
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNodee node = head;
        while(node != null && node.next != null){
            if(node.next.val == val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }

    public class ListNodee {
        public int val;
        public ListNodee next;

        ListNodee() {
        }

        ListNodee(int val) {
            this.val = val;
        }

        ListNodee(int val, ListNodee next) {
            this.val = val;
            this.next = next;
        }

    }
}
