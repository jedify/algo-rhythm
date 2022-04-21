package com.algorhythm.medium.heap;

import com.google.gson.Gson;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        new KthLargestElementInAnArray().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
    }

    public int findKthLargest(int[] nums, int k) {
        for (int i = (nums.length-1) / 2; i >= 0; i--) {
            heapify(nums, i);
        }

        System.out.println(new Gson().toJson(nums));
        int distinct = 1, val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (distinct == k) {
                break;
            }
            if (val != nums[i]) {
                distinct++;
                val = nums[i];
            }
        }

        return nums[k - 1];
    }

    private void heapify(int[] nums, int i) {
        int left = i * 2 + 1;
        int max = i;
        if (left < nums.length && nums[left] > nums[i]) {
            max = left;
        }

        int right = 2 * i + 2;
        if (right < nums.length && nums[right] > nums[max]) {
            max = right;
        }

        if (max != i) {
            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
            heapify(nums, max);
        }
    }
}
