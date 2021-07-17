package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

public class DeleteLeavesWithValue {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(4);
    new DeleteLeavesWithValue().removeLeafNodes(root, 2);
  }

  public TreeNode removeLeafNodes(TreeNode root, int target) {
    if (root == null) {
      return null;
    }
    return removeLeafNode(root, target);
  }

  private TreeNode removeLeafNode(TreeNode node, int target) {
    if (node == null) {
      return null;
    }

    node.left = removeLeafNode(node.left, target);

    node.right = removeLeafNode(node.right, target);

    if (node.left == null && node.right == null && node.val == target) {
      return null;
    }
    return node;
  }
}
