package com.algorhythm.medium.list;

public class PartitionKEqualSubSetSum {
    public static void main(String[] args) {
        System.out.println(new PartitionKEqualSubSetSum().canPartitionKSubsets(new int[] {1,2,3,4}, 3));
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if ((sum % k) != 0) {
            return false;
        }

        int[][] result = new int[nums.length + 1][sum + 1];
        sum = sum/k;
        for (int i = 0; i < nums.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    result[i][j] = 0;
                }
                if (j == 0) {
                    result[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if(nums[i-1] <= j) {
                    result[i][j] = result[i-1][j-nums[i-1]] + result[i-1][j];
                } else {
                    result[i][j] = result[i-1][j];
                }
            }
        }

        return result[nums.length][sum] >= k;
    }
}
