package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SymmetricTree {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.right.left = new TreeNode(2);
    System.out.println(new SymmetricTree().isSymmetric(root));
  }
  public boolean isSymmetric(TreeNode root) {
    List<Integer> preOrder = new ArrayList<>();
    inOrder(root.left, preOrder);
    System.out.println(Arrays.toString(preOrder.toArray()));
    List<Integer> postOrder = new ArrayList<>();
    inOrder(root.right, postOrder);
    System.out.println(Arrays.toString(postOrder.toArray()));
    if(preOrder.size() == postOrder.size()) {
      for(int i=0;i<preOrder.size();i++) {
        if(preOrder.get(i) != postOrder.get(i)) {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }

  private void inOrder(TreeNode root, List<Integer> treeNodeList) {
    if(root==null) {
      return;
    }
    inOrder(root.left, treeNodeList);
    treeNodeList.add(root.val);
    inOrder(root.right, treeNodeList);
  }

  private void traversePreOrder(TreeNode root, List<Integer> treeNodeList) {
    if(root==null) {
      return;
    }
    treeNodeList.add(root.val);
    traversePreOrder(root.left, treeNodeList);
    traversePreOrder(root.right, treeNodeList);
  }

  private void traversePostOrder(TreeNode root, List<Integer> treeNodeList) {
    if(root==null) {
      return;
    }
    traversePostOrder(root.left, treeNodeList);
    traversePostOrder(root.right, treeNodeList);
    treeNodeList.add(root.val);
  }
}
