package com.algorhythm.medium.tree;

import java.util.HashMap;
import java.util.Map;

public class CloneBinaryTreeWithRandomPointer {
    public NodeCopy copyRandomBinaryTree(Node root) {
        Map<Node, NodeCopy> nodes = new HashMap<>();
        traverse(root, nodes);
        linkNodes(root, nodes);
        return nodes.get(root);
    }

    private void linkNodes(Node root, Map<Node, NodeCopy> nodes) {
        if(root==null) {
            return;
        }
        NodeCopy node = nodes.get(root);
        if (root.left != null) {
            node.left = nodes.get(root.left);

        }
        if (root.right != null) {
            node.right = nodes.get(root.right);
        }
        if (root.random != null) {
            node.random = nodes.get(root.random);
        }
        linkNodes(root.left, nodes);
        linkNodes(root.right, nodes);
    }

    private void traverse(Node root, Map<Node, NodeCopy> nodes) {
        if (root == null) {
            return;
        }

        nodes.put(root, new NodeCopy(root.val));
        traverse(root.left, nodes);
        traverse(root.right, nodes);
    }


    public class Node {
        int val;
        Node left;
        Node right;
        Node random;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right, Node random) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.random = random;
        }
    }

    public class NodeCopy {
        int val;
        NodeCopy left;
        NodeCopy right;
        NodeCopy random;

        NodeCopy() {
        }

        NodeCopy(int val) {
            this.val = val;
        }

        NodeCopy(int val, NodeCopy left, NodeCopy right, NodeCopy random) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.random = random;
        }
    }

}
