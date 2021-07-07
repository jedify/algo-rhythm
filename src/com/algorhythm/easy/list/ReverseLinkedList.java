package com.algorhythm.easy.list;

import com.algorhythm.medium.list.ListNode;
/**
 * https://leetcode.com/problems/reverse-linked-list/
 * */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode prevNode = new ListNode(head.val);
            head = head.next;
        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            newNode.next = prevNode;
            prevNode = newNode;
            head = head.next;
        }
        return prevNode;
    }
}
