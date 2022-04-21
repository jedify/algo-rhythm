package com.algorhythm.medium.dp;

public class JumpGame {
    public boolean canJump(int[] nums) {
        boolean[] memo = new boolean[nums.length];
        memo[nums.length-1] = true;
        for(int i=nums.length-2; i>=0;i--) {
            if(nums[i] >= nums.length-1-i) {
                memo[i] = true;
            } else {
                for(int j=nums[i]; j>0;j--) {
                    if(memo[i+j]==true) {
                        memo[i]=true;
                        break;
                    }
                }
            }
        }
        return memo[0];
    }
}
