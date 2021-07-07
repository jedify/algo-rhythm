package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllElementsInTwoBST {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(4);

    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(0);
    root1.right = new TreeNode(3);
    new AllElementsInTwoBST().getAllElements(null, root1);
  }

  public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    List<Integer> list1 = new ArrayList<>();
    inOrderTraverseintoList(root1, list1);
    List<Integer> list2 = new ArrayList<>();
    inOrderTraverseintoList(root2, list2);
    int i = 0, j = 0;
    List<Integer> result = new ArrayList<>();
    while (i < list1.size() && j < list2.size()) {
      if (list1.get(i) < list2.get(j)) {
        result.add(list1.get(i++));
      } else if (list1.get(i) > list2.get(j)) {
        result.add(list2.get(j++));
      } else {
        result.add(list1.get(i++));
        result.add(list2.get(j++));
      }
    }
    addRemainingElement(i, list1, result);
    addRemainingElement(j, list2, result);
    System.out.println(Arrays.toString(result.toArray()));
    return result;
  }

  private void addRemainingElement(int i, List<Integer> from, List<Integer> result) {
    while (i < from.size()) {
      result.add(from.get(i++));
    }
  }

  private void inOrderTraverseintoList(TreeNode root, List<Integer> sortedList) {
    if (root == null) {
      return;
    }

    inOrderTraverseintoList(root.left, sortedList);
    sortedList.add(root.val);
    inOrderTraverseintoList(root.right, sortedList);
  }
}
