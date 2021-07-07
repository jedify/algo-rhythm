package com.algorhythm.easy.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PopulateNextPointerToRight {
  class Node {
    int val;
    Node left;
    Node right;
    Node next;
  }

  public Node connect(Node root) {
    List<Node> processedNode = new ArrayList<>();
    traverseLevelOrder(root, processedNode);
    for (int i = 0; i < processedNode.size() - 1; i++) {
      if (processedNode.get(i) == null) {
        continue;
      }
      processedNode.get(i).next = processedNode.get(i + 1);
    }
    return root;
  }

  private void traverseLevelOrder(Node root, List<Node> processedNodes) {
    Queue<Node> nodeList = new ArrayDeque<>();
    nodeList.add(root);
    while (!nodeList.isEmpty()) {
      Node node = nodeList.poll();
      processedNodes.add(node);

      if (nodeList.isEmpty()) {
        processedNodes.add(null);
      }
      if (node.left != null) {
        nodeList.add(node.left);
      }

      if (node.right != null) {
        nodeList.add(node.right);
      }
    }

  }
}
