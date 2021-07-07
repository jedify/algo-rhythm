package com.algorhythm.structure;

import java.util.List;

public class NryTreeNode {
  public int val;
  public List<NryTreeNode> children;

  public NryTreeNode() {
  }

  public NryTreeNode(int _val) {
    val = _val;
  }

  public NryTreeNode(int _val, List<NryTreeNode> _children) {
    val = _val;
    children = _children;
  }
}
