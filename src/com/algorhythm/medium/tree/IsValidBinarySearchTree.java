package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

public class IsValidBinarySearchTree {
  public boolean isValidBST(TreeNode root) {
    if ((root == null) || (root.left == null && root.right == null)) {
      return true;
    }
    return isValidNode(root, null, null);
  }

  private boolean isValidNode(TreeNode root, Integer min, Integer max) {
    if (root == null) return true;
    if ((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
    return isValidNode(root.left, min, root.val) && isValidNode(root.right, root.val, max);
  }
}
