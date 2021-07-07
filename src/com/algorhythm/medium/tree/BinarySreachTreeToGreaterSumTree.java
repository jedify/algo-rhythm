package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinarySreachTreeToGreaterSumTree {
  public TreeNode bstToGst(TreeNode root) {
    List<Integer> inOrderTraverse = new ArrayList<>();
    traverseList(root, inOrderTraverse);
    Map<Integer, Integer> sumKeyMap = new HashMap<>();

    int runningSum = 0;
    for (int i = inOrderTraverse.size() - 1; i >= 0; i--) {
      runningSum += inOrderTraverse.get(i);
      sumKeyMap.put(inOrderTraverse.get(i), runningSum);
    }
    traverseUpdateNode(root, sumKeyMap);
    return root;
  }

  private void traverseList(TreeNode root, List<Integer> inOrderList) {
    if (root == null) {
      return;
    }
    traverseList(root.left, inOrderList);
    inOrderList.add(root.val);
    traverseList(root.right, inOrderList);
  }

  private void traverseUpdateNode(TreeNode root, Map<Integer, Integer> sumKeyMap) {
    if (root == null) {
      return;
    }
    traverseUpdateNode(root.left, sumKeyMap);
    root.val = sumKeyMap.get(root.val);
    traverseUpdateNode(root.right, sumKeyMap);
  }

}
