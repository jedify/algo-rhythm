package com.algorhythm.easy.list;

public class RunningSum {
  public int[] runningSum(int[] nums) {
    if(nums.length <2) {
      return  nums;
    }
    for(int i=1;i<nums.length;i++) {
      nums[i] = nums[i-1] + nums[i];
    }
    return nums;
  }
}
