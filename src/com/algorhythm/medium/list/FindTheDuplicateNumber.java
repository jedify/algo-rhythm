package com.algorhythm.medium.list;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int curr = nums[i];
            if(curr == i+1) {
                i++;
                continue;
            }

            if(nums[curr-1] == curr) {
                return curr;
            }

            nums[i] = nums[curr-1];
            nums[curr-1] = curr;
        }
        return -1;
    }
}
