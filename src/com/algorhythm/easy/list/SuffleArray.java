package com.algorhythm.easy.list;

import java.util.Arrays;

public class SuffleArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new SuffleArray().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
  }

  public int[] shuffle(int[] nums, int n) {
    int temp=0;
    int[] result = new int[nums.length];
    for (int i = 0; i < n; i++) {
     result[temp++] = nums[i];
     result[temp++] = nums[n+i];
    }
    return result;
  }
}
