package com.algorhythm.easy.array;

import java.util.HashMap;
import java.util.Map;

public class FindSingleNumber {
    public static void main(String[] args) {
        System.out.println(new FindSingleNumber().singleNumberOr(new int[] {3,4,3,5,6,5,6}));
    }
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (freqMap.containsKey(nums[i])) {
                freqMap.remove(nums[i]);
            } else {
                freqMap.put(nums[i], 1);
            }
        }

        return freqMap.entrySet().iterator().next().getKey();
    }

    public int singleNumberOr(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result = result ^ n;
        }
        return result;
    }
}
