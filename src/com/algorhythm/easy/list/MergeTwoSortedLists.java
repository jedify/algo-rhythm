package com.algorhythm.easy.list;

import com.algorhythm.medium.list.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(-9);
        l1.next = new ListNode(-7);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(-7);
        l2.next = new ListNode(-7);
        l2.next.next = new ListNode(4);
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = null, temp = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            temp = l1;
            l1 = l1.next;
        } else {
            temp = l2;
            l2 = l2.next;
            temp.next = l1;
        }
        root = temp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp = l1;
                l1 = l1.next;
                continue;
            }
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
                temp.next.next = l1;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp.next.next = l1;
                temp = l1;
                l1 = l1.next;
            }
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return root;
    }
}
