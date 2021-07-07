package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }

    private void traverse(TreeNode root, List<Integer> orderedList) {
        if (root == null) {
            return;
        }
        traverse(root.left, orderedList);
        orderedList.add(root.val);
        traverse(root.right, orderedList);

    }
}
