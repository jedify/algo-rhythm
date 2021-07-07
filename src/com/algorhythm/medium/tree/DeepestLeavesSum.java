package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class DeepestLeavesSum {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(7);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(12);
    root.right.left = new TreeNode(10);
    System.out.println(new DeepestLeavesSum().deepestLeavesSum(root));
  }

  public int deepestLeavesSum(TreeNode root) {
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    queue.add(new TreeNode(-1));
    int sumOfLevel = 0;
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.val == -1) {
        if (queue.isEmpty()) {
          break;
        } else {
          queue.add(new TreeNode(-1));
          sumOfLevel = 0;
          continue;
        }
      }
      sumOfLevel += node.val;
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
    return sumOfLevel;
  }
}
