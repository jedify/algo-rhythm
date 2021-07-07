package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

public class BalancedBinaryTree {
  public static void main(String[] args) {
    TreeNode tNode = new TreeNode(1);
    tNode.left = new TreeNode(2);
    tNode.left.left = new TreeNode(3);
    tNode.left.left.left = new TreeNode(4);

    tNode.right = new TreeNode(2);
    tNode.right.right = new TreeNode(3);
    tNode.right.right.right = new TreeNode(4);
    System.out.println(new BalancedBinaryTree().isBalanced(tNode));
  }

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    if ((Math.abs(height(root.left) - height(root.right)) <= 1) && isBalanced(root.left)
            && isBalanced(root.right)) {
      return true;
    }

    return false;
  }

  private int height(TreeNode treeNode) {
    if (treeNode == null) {
      return 0;
    }

    return Math.max(1 + height(treeNode.left), 1 + height(treeNode.right));
  }
}
