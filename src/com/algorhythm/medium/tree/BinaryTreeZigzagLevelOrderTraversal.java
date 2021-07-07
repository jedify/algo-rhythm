package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

import java.util.*;

/**
 * BFS, Queue, LinkedList, Binary Tree
 * Take a flag to alter the order of processing,
 * use linkedList for processed element at level if order is true add to tail or head,
 * use queue to level order traversal
**/

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> lists = new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        boolean order = true;
        treeNodes.add(root);
        treeNodes.add(null);
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> levelNodes = new LinkedList<>();
        while (!treeNodes.isEmpty()) {
            TreeNode node = treeNodes.poll();
            if(order) {
                levelNodes.add(node.val);
            } else {
                levelNodes.addFirst(node.val);
            }
            if(node.left != null) {
                treeNodes.add(node.left);
            }
            if(node.right != null) {
                treeNodes.add(node.right);
            }

            if(treeNodes.peek() == null) {
                order = !order;
                treeNodes.poll();
                if(!treeNodes.isEmpty()) {
                    treeNodes.add(null);
                }
                result.add(levelNodes);
                levelNodes = new LinkedList<>();
            }
        }
        return result;
    }
}
