package com.algorhythm.easy.array;

import com.google.gson.Gson;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new DecompressRunLengthEncodedList().decompressRLElist(new int[] {1,1,2,3})));
    }
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            size += nums[i];
        }
        int[] result = new int[size];
        int freq = nums[0], resultIndex=0;
        for (int i = 1; i < nums.length; i=i+2) {
            for(int j=0;j<freq;j++) {
                result[resultIndex++] = nums[i];
            }
            if(i+1 < nums.length) {
                freq = nums[i + 1];
            }
        }
        return result;
    }
}
