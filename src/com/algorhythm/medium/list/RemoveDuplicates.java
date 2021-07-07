package com.algorhythm.medium.list;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] input = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
    int count = removeDuplicates(input);
    System.out.println(count);

  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length < 3) {
      return nums.length;
    }
    int currentIndex = 2, totalLength = nums.length;
    while (currentIndex < totalLength) {
      if ((nums[currentIndex] == nums[currentIndex - 1]) && (nums[currentIndex] == nums[currentIndex - 2])) {
        for (int i = currentIndex; i < totalLength - 1; i++) {
          nums[i] = nums[i + 1];
        }
        totalLength--;
      } else {
        currentIndex++;

      }
    }
    return totalLength;
  }
}
