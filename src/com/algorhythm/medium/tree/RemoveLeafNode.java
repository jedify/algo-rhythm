package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

public class RemoveLeafNode {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(3);
    /*root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(4);*/
    TreeNode treeNode = new RemoveLeafNode().removeLeafNodes(root, 3);
    TreeNode.printPreOrder(treeNode);
  }

  public TreeNode removeLeafNodes(TreeNode root, int target) {
    if (root == null) {
      return null;
    }
    if (root.left == null && root.right == null) {
      if (root.val == target) return null;
      else
        return root;
    }

    root.left = removeLeafNodes(root.left, target);
    root.right = removeLeafNodes(root.right, target);
    return root;
  }

  private void removeTreeNode(TreeNode parent, TreeNode node, int target) {
    if (node == null) {
      return;
    }

    if ((node.val == target) && (node.left == null) && (node.right == null)) {
      if (parent.left != null && parent.left.val == node.val) {
        parent.left = null;
      }

      if (parent.right != null && parent.right.val == node.val) {
        parent.right = null;
      }
    }

    removeTreeNode(node, node.left, target);
    removeTreeNode(node, node.right, target);
  }
}
