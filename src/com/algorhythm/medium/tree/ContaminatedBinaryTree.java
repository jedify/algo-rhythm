package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

public class ContaminatedBinaryTree {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(-1);
    root.left = new TreeNode(-1);
    root.right = new TreeNode(-1);
    root.left.left = new TreeNode(-1);
    root.left.right = new TreeNode(-1);


    ContaminatedBinaryTree tree = new ContaminatedBinaryTree(root);
    System.out.println(tree.find(1));
    System.out.println(tree.find(3));
    System.out.println(tree.find(5));
  }

  private TreeNode root;

  public ContaminatedBinaryTree(TreeNode root) {
    this.root = root;
    fillNodes(root);
  }

  private void fillNodes(TreeNode root) {
    if (root == null) {
      return;
    }

    if (root.val == -1) {
      root.val = 0;
    }

    if (root.left != null) {
      root.left.val = root.val * 2 + 1;
    }

    if (root.right != null) {
      root.right.val = root.val * 2 + 2;
    }

    fillNodes(root.left);
    fillNodes(root.right);
  }

  public boolean find(int target) {
    return findNode(this.root, target);
  }

  private boolean findNode(TreeNode root, int target) {
    if (root == null) {
      return false;
    }

    if (root.val == target) {
      return true;
    }

    return findNode(root.left, target) || findNode(root.right, target);
  }
}
