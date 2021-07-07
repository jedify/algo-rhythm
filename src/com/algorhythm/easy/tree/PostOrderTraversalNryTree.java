package com.algorhythm.easy.tree;

import com.algorhythm.structure.NryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversalNryTree {
  public List<Integer> postorder(NryTreeNode root) {
    List<Integer> result = new ArrayList<>();
    traversePreOrder(root, result);
    return result;
  }
  private void traversePreOrder(NryTreeNode root, List<Integer> orderedList) {
    if(root == null) {
      return;
    }


    for(int i=0; i<root.children.size();i++) {
      traversePreOrder(root.children.get(i), orderedList);
    }
    orderedList.add(root.val);
  }
}
