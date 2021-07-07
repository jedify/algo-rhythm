package com.algorhythm.easy.array;

import com.google.gson.Gson;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arg = {2, 0, 3, 4, 0, -2, 7};
        new MoveZeros().moveZeroes(arg);
        System.out.println(new Gson().toJson(arg));
    }
    public void moveZeroes(int[] nums) {
        int pointer=-1, numZeros=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] !=0) {
                pointer++;
                nums[pointer] = nums[i];
            } else {
                numZeros++;
            }
        }

        for(int i=0;i<numZeros;i++) {
            nums[nums.length - i-1] = 0;
        }
    }
}
