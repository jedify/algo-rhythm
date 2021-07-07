package com.algorhythm.easy.tree;

import com.algorhythm.structure.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Use a hashset, traverse node find the companion node in set if exists return true else add to set
 **/
public class TwoSumIVBST {
    public static void main(String[] args) {
        TwoSumIVBST twoSumIVBST = new TwoSumIVBST();
        TreeNode root = new TreeNode(334);
        root.left = new TreeNode(277);
        root.right = new TreeNode(507);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(285);
        root.right.right = new TreeNode(678);
        System.out.println(twoSumIVBST.findTarget(root, 509));
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> nodes = new HashSet<>();
        return find(root, k, nodes);
    }

    private boolean find(TreeNode node, int k, Set<Integer> nodes) {
        if (node == null) {
            return false;
        }
        if (nodes.contains(k - node.val)) {
            return true;
        }
        nodes.add(node.val);
        return find(node.left, k, nodes) || find(node.right, k, nodes);
    }

    /*Using Hashset*/
    /*public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> nodeValues = new HashSet();
        traverse(root, nodeValues);
        for (Integer nodeValue : nodeValues) {
            int elementToLookUp = k - nodeValue;
            if(elementToLookUp == nodeValue.intValue()) {
                continue;
            }
            if (nodeValues.contains(elementToLookUp)) {
                return true;
            }
        }
        return false;
    }

    private void traverse(TreeNode root, HashSet<Integer> nodeValues) {
        if (root == null) {
            return;
        }

        nodeValues.add(root.val);
        traverse(root.left, nodeValues);
        traverse(root.right, nodeValues);
    }*/
}
