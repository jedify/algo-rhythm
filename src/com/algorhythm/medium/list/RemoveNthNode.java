package com.algorhythm.medium.list;

import java.util.Stack;

public class RemoveNthNode {
  public static void main(String[] args) {
    ListNode l1, l2, headL1, headL2;
    l1 = headL1 = new ListNode(7);
    l1.next = new ListNode(8);
   /* l1 = l1.next;
    l1.next = new ListNode(9);
    l1 = l1.next;
    l1.next = new ListNode(10);*/

    ListNode.traverse(headL1);
    ListNode.traverse(removeNthFromEnd(headL1, 2));
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    int index = 0;
    ListNode result = head;
    ListNode lastNode = null;
    Stack<ListNode> nodeStack = new Stack<>();
    while (head != null) {
      nodeStack.push(head);
      head = head.next;
    }
    while (index++ < n) {
      lastNode = nodeStack.pop();
    }
    if (nodeStack.isEmpty()) {
      return lastNode.next;
    }
    lastNode = nodeStack.pop();

    lastNode.next = lastNode.next.next;

    return result;
  }
}
