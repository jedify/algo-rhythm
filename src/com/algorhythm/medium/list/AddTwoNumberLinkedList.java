package com.algorhythm.medium.list;

public class AddTwoNumberLinkedList {
  public static void main(String[] args) {
    ListNode l1, l2, headL1, headL2;
    l1 = headL1 = new ListNode(9);
    l1.next = new ListNode(9);
    l1 = l1.next;
    l1.next = new ListNode(9);

    l2 = headL2 = new ListNode(9);
    l2.next = new ListNode(9);
    l2 = l2.next;
    ListNode.traverse(headL1);
    ListNode.traverse(headL2);
    ListNode.traverse(addTwoNumbers(headL1, headL2));
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null, l3 = null;
    int carryOver = 0;
    if (l1 == null) {
      return l2;
    }

    if (l2 == null) {
      return l1;
    }

    while (l1 != null && l2 != null) {
      int sum = l1.val + l2.val + carryOver;
      if (sum >= 10) {
        sum = sum - 10;
        carryOver = 1;
      } else {
        carryOver = 0;
      }

      ListNode newNode = new ListNode(sum);
      if (head != null) {
        l3.next = newNode;
      } else {
        head = newNode;
      }
      l3 = newNode;
      l1 = l1.next;
      l2 = l2.next;
    }

    while (l1 != null) {
      int sum = l1.val + carryOver;
      if (sum >= 10) {
        sum = sum - 10;
        carryOver = 1;
      } else {
        carryOver = 0;
      }
      ListNode newNode = new ListNode(sum);
      l3.next = newNode;
      l3 = newNode;
      l1 = l1.next;
    }

    while (l2 != null) {
      int sum = l2.val + carryOver;
      if (sum >= 10) {
        sum = sum - 10;
        carryOver = 1;
      } else {
        carryOver = 0;
      }
      ListNode newNode = new ListNode(sum);
      l3.next = newNode;
      l3 = newNode;
      l2 = l2.next;
    }

    if (carryOver > 0) {
      l3.next = new ListNode(carryOver);
    }
    return head;
  }
}
