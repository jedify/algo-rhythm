package com.algorhythm.medium.list;

public class MergeInBetweenLinkedList {
  public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    ListNode head1 = list1;
    while (head1.next.val != a) {
      head1 = head1.next;
    }
    ListNode joinPoint = head1;
    while (head1.val != b) {
      head1 = head1.next;
    }

    joinPoint.next = list2;
    while (list2.next != null) {
      list2 = list2.next;
    }
    list2.next = head1.next;
    return list1;
  }
}
