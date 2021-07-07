package com.algorhythm.medium.list;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static void traverse(ListNode head) {
    System.out.println("");
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }
}