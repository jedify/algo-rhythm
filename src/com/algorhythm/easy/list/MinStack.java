package com.algorhythm.easy.list;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(-1);
    minStack.push(0);
    minStack.push(-3);
  }
  List<Integer> stack = new ArrayList<>();
  int min;

  public MinStack() {
    min = Integer.MAX_VALUE;
  }

  public void push(int x) {
    if (min > x) {
      min = x;
    }
    stack.add(x);
  }

  public void pop() {
    int element = stack.remove(stack.size() - 1);
    if (element == min) {
      min = Integer.MAX_VALUE;
      stack.forEach(value -> min = min > value ? value : min);
    }
  }

  public int top() {
    return stack.get(stack.size() - 1);
  }

  public int getMin() {
    return min;
  }
}
