package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return (left.val == right.val) && isSame(left.left, right.left) && isSame(left.right, right.right);
    }
}
