package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

public class InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    invertNode(root);
    return root;
  }

  private void invertNode(TreeNode node) {
    if (node == null || (node.left == null && node.right == null)) {
      return;
    }

    TreeNode left = node.left;
    node.left = node.right;
    node.right = left;
    invertTree(node.left);
    invertTree(node.right);
  }
}
