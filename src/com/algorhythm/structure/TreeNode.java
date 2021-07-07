package com.algorhythm.structure;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static void printPreOrder(TreeNode root) {
    if (root == null) return;
    System.out.print(root.val + "  ");
    printPreOrder(root.left);
    printPreOrder(root.right);
  }

  public static void printInPreOrder(TreeNode root) {
    if (root == null) return;
    printInPreOrder(root.left);
    System.out.print(root.val + "  ");
    printInPreOrder(root.right);
  }

  public static void printPostPreOrder(TreeNode root) {
    if (root == null) return;
    printPostPreOrder(root.left);
    printPostPreOrder(root.right);
    System.out.print(root.val + "  ");
  }
}
