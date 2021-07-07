package com.algorhythm.medium.list;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public static void main(String[] args) {
        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);

        node1.next = node2;
        node1.random =  node4;

        node2.next=node3;
        node2.random=node1;

        node3.next=node4;
        node3.random=node2;
        new CopyListWithRandomPointer().copyRandomList(head);
    }
    Map<Node, Node> nodes;

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        nodes = new HashMap();
        Node node = head;
        while(node!=null) {
            Node newNode = new Node(node.val);
            nodes.put(node, newNode);
            node=node.next;
        }
        Node root = nodes.get(head);
        while(head!=null) {
            node = nodes.get(head);
            node.next = nodes.get(head.next);
            node.random = nodes.get(head.random);
            head=head.next;
        }
        return root;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
