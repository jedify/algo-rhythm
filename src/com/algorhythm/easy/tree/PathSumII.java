package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<>();
    pathSumTillNode(root, sum, result, new ArrayList<>());
    return result;
  }

  private void pathSumTillNode(TreeNode node, int remaining, List<List<Integer>> result, List<Integer> pathTillNode) {
    if (node == null) {
      return;
    }
    pathTillNode.add(node.val);
    if (node.left == null && node.right == null && remaining == node.val) {
      result.add(pathTillNode);
    }
    pathSumTillNode(node.left, remaining - node.val, result, new ArrayList<>(pathTillNode));
    pathSumTillNode(node.right, remaining - node.val, result, new ArrayList<>(pathTillNode));
  }
}
