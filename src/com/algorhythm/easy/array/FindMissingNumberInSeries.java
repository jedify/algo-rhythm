package com.algorhythm.easy.array;

class FindMissingNumberInSeries {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int num: nums) {
            sum+=num;
        }
        return ((nums.length * (nums.length+1))/2)-sum;
    }
}