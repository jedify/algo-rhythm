package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InOrderTraversal {
  public static void main(String[] args) {
    TreeNode tNode = new TreeNode(20);
    tNode.left = new TreeNode(50);
    tNode.right = new TreeNode(30);
    tNode.left.left=new TreeNode(25);
    tNode.left.left.left=new TreeNode(20);
    tNode.right.left = new TreeNode(56);
    tNode.right.right = new TreeNode(70);
    tNode.right.right.right = new TreeNode(90);
    System.out.println(Arrays.toString(inorderTraversal(tNode).toArray()));
  }
  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    traverse(root, list);
    return list;
  }

  private static void traverse(TreeNode root, List<Integer> orderedList) {
    if(root == null) {
      return;
    }
    traverse(root.left, orderedList);
    orderedList.add(root.val);
    traverse(root.right, orderedList);

  }
}
