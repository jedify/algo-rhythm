package com.algorhythm.hard.array;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int pivot;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < 1) {
                nums[i] = 0;
                i++;
                continue;
            }
            if (nums[i] - 1 != i) {
                if (nums[i] > nums.length) {
                    nums[i] = 0;
                    i++;
                    continue;
                }
                if (nums[nums[i] - 1] == nums[i]) {
                    nums[i] = 0;
                    i++;
                    continue;
                }
                pivot = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = pivot;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
