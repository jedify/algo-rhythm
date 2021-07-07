package com.algorhythm.medium.tree;

import com.algorhythm.structure.TreeNode;

public class MaximumBinaryTree {
  public static void main(String[] args) {
    TreeNode node = new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    TreeNode.printPreOrder(node);
  }

  public TreeNode constructMaximumBinaryTree(int[] nums) {
    int maxIndex = getMaxElementInArray(nums);
    TreeNode node = new TreeNode(nums[maxIndex]);
    if (maxIndex > 0) {
      node.left = constructMaximumBinaryTree(splitArray(nums, 0, maxIndex - 1));
    }

    if (maxIndex < nums.length - 1) {
      node.right = constructMaximumBinaryTree(splitArray(nums, maxIndex + 1, nums.length - 1));
    }
    return node;
  }

  private int[] splitArray(int[] nums, int start, int end) {
    int[] result = new int[end - start + 1];
    for (int i = start,index=0; i <= end; i++,index++) {
      result[index] = nums[i];
    }

    return result;
  }

  private int getMaxElementInArray(int[] nums) {
    int max = nums[0], maxIndex = 0, index = 1;
    while (index < nums.length) {
      if (nums[index] > max) {
        maxIndex = index;
        max = nums[index];
      }
      index++;
    }
    return maxIndex;
  }
}
