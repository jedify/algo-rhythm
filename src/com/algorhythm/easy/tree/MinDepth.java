package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

public class MinDepth {
  public static void main(String[] args) {
    TreeNode tNode = new TreeNode(1);
   /* tNode.left = new TreeNode(2);
    tNode.left.left = new TreeNode(3);
    tNode.left.left.left = new TreeNode(4);*/

    tNode.right = new TreeNode(2);
    tNode.right.right = new TreeNode(3);
    tNode.right.right.right = new TreeNode(4);
    System.out.println(new MinDepth().minDepth(tNode));
  }
  public int minDepth(TreeNode root) {
    if(root.left== null && root.right == null) {
      return 0;
    }

    if(root.left == null) {
      return 1+minDepth(root.right);
    }

    if(root.right==null){
      return 1+minDepth(root.left);
    }
    return Math.min(1+minDepth(root.left), 1+minDepth(root.right));
  }
}
