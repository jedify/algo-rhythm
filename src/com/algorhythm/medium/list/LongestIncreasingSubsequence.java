package com.algorhythm.medium.list;

import java.util.Arrays;
/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, 1);
        for(int i=1;i<nums.length;i++) {
            for(int j=0;j<i;j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int maxLen = 0;
        for(int num:dp) {
            maxLen = Math.max(maxLen, num);
        }
        return maxLen;
    }
}
