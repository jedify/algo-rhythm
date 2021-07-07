package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

public class SymmetricTree1 {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.right.left = new TreeNode(2);
    System.out.println(new SymmetricTree1().isSymmetric(root));
  }

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isMirror(root.left, root.right);
  }

  private boolean isMirror(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }

    if (left == null || right == null) {
      return false;
    }

    return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
  }

}
