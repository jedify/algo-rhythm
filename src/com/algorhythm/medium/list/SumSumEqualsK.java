package com.algorhythm.medium.list;

public class SumSumEqualsK {
    public static void main(String[] args) {
        System.out.println(new SumSumEqualsK().subarraySum(new int[]{1, 2, 2, 3, 1, 4, 5}, 5));
    }

    public int subarraySum(int[] nums, int k) {
        int pivot = 0, sum = nums[0], totalCount = 0;
        if (sum == k) {
            totalCount++;
        }
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum >= k) {
                if (sum == k) {
                    totalCount++;
                }
                sum = sum - nums[pivot++];
            }
        }
        return totalCount;
    }
}
