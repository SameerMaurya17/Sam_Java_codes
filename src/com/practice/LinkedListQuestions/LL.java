package com.practice.LinkedListQuestions;

public class LL {

// Ques 17) https://leetcode.com/problems/rotate-list/

    public Node rotateRight(Node head, int k) {

        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;

        while(last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }

 // Ques 16 https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public Node reverseAlternateKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }


// Ques 15) https://leetcode.com/problems/reverse-nodes-in-k-group/description/

    public Node reverseKGroup(Node head, int k) {

        if(head == null || head.next == null || k <= 1){
            return head;
        }

        Node prev = null;
        Node current = head;
        Node last = prev;
        Node next = current.next;

        int count = getLength(head) / k;

        while(count > 0){
            Node newEnd = current;
            for (int i = 0; i < k && current != null; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;
            last = newEnd;
            count--;
        }

    return head;
    }

    public int getLength(Node head){
        if(head == null){
            return 0;
        }
        int length = 1;
        Node node = head;
        while(node.next != null){
            node = node.next;
            length++;
        }
        return length;
    }

// Ques 14) https://leetcode.com/problems/reorder-list/description/

    public void reorderList(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = middleNode(head);
        Node hs = reverseList(mid);
        Node hf = head;

        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if(hf != null){
            hf.next = null;
        }
    }

// Ques 13) https://leetcode.com/problems/palindrome-linked-list/

    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);
        Node rereverseHead = headSecond;

        while(head != null && headSecond  != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }

// Ques 12) https://leetcode.com/problems/reverse-linked-list-ii/description/

    public Node reverseBetween(Node head, int left, int right) {
        if(left == right){
            return head;
        }

        Node current = head;
        Node prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
        Node next = current.next;

        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

// Ques 9) reverse a linklist (10)
// https://leetcode.com/problems/reverse-linked-list/description/

    public Node reverseList(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

//    public void reverse(){
//        if(size < 2){
//            return;
//        }
//
//        Node prev = null;
//        Node present = head;
//        Node next = present.next;
//
//        while(present != null){
//            present.next = prev;
//            prev = present;
//            present = next;
//            if(next != null){
//                next = next.next;
//            }
//        }
//        head = prev;
//    }

    // recursive reverse
    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

// Ques 8)  https://leetcode.com/problems/sort-list/   (9) also in MergeSort class
public void bubbleSort() {
    bubbleSort(size, 0); // (size - 1) but not in my code
}

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

// Ques 7) Finding the middle node
// https://leetcode.com/problems/middle-of-the-linked-list/description/

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

//    public Node middleNode(LL list) {
//        Node slow = list.head;
//        Node fast = list.head;
//
//        while(fast != null && fast.next != null ){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }

// Ques 6) Happy Number
// https://leetcode.com/problems/happy-number/description/

    public boolean isHappy(int n){

        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow != fast);

        return slow == 1;
    }

    public int findSquare(int n){
        int ans = 0;
        while(n != 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

// Ques 5) Linked list cycle 2
// https://leetcode.com/problems/linked-list-cycle-ii/description/

    public Node detectCycle(Node head){
        int length = cycleLength(head);

        if(length == 0){
            return null;
        }

        // find the start node
        Node f = head;
        Node s = head;

        while(length != 0){
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

// Ques 4) Length of link list cycle

    public int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int length = 0;
                do{
                    slow = slow.next;
                    length++;
                } while(slow != fast);
                return length;
            }
        }
        return 0;
    }

// Ques 3) Linked-list-cycle
// https://leetcode.com/problems/linked-list-cycle/description/
public boolean hasCycle(LL list) {
    Node fast = list.head;
    Node slow = list.head;
    while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            return true;
        }
    }
    return false;
}


// Ques 2) Merge two sorted lists
// https://leetcode.com/problems/merge-two-sorted-lists/description/

    public void test(){
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.test();
    }



// Ques 1) Remove Duplicates from sorted list
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

    public void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
    }



    // LinkList Functions and Methods below-----------------------------------------------------

    private int size;
    private Node head;
    private Node tail;



    public LL() {
        this.size = 0;
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
            return "[" + value + "]" ;
        }
    }

}
