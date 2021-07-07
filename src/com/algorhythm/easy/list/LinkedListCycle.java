package com.algorhythm.easy.list;

import com.algorhythm.medium.list.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null) {
            if(fast.next == null) {
                return false;
            }

            if(slow.next == fast.next) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public boolean hasCycleWithMap(ListNode head) {
        Map<ListNode, Boolean> visited = new HashMap<>();
        while(head.next!=null) {
            if(visited.get(head.next)) {
                return true;
            }

            visited.put(head, true);
            head = head.next;
        }
        return false;
    }
}
