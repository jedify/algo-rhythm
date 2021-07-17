package com.algorhythm.medium.list;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int left=1, right=1;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length;i++) {
            result[i] = left;
            left=result[i]*nums[i];
        }

        for(int j=nums.length-1;j>=0; j--) {
            result[j]=result[j]*right;
            right = right*nums[j];
        }
        return result;
    }
}
