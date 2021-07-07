package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.right.left = new TreeNode(3);
    root.right.left.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    root.right.left.left.left = new TreeNode(5);
    System.out.println(new LevelOrderTraversal().levelOrder(root));
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new ArrayDeque();
    queue.add(root);

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> level = new ArrayList<>();
    Queue<TreeNode> tempQueue = new ArrayDeque<>();
    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      level.add(current.val);
      if (current.left != null) {
        tempQueue.add(current.left);
      }
      if (current.right != null) {
        tempQueue.add(current.right);
      }
      if (queue.isEmpty()) {
        list.add(level);
        level = new ArrayList<>();
        queue = tempQueue;
        tempQueue = new ArrayDeque<>();
      }
    }

    return list;
  }
}
