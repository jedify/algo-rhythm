package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

import java.util.LinkedList;

public class FlattenBinaryTree {
  public void flatten(TreeNode root) {
    LinkedList<Integer> traversedList = new LinkedList<>();
    traverse(root, traversedList);
    root.val = traversedList.getFirst();
    root.left = null;
    for (int i = 1; i < traversedList.size(); i++) {
      root.right = new TreeNode(traversedList.get(i));
      root = root.right;
    }
  }

  private void traverse(TreeNode root, LinkedList<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.val);
    traverse(root.left, list);
    traverse(root.right, list);
  }
}
