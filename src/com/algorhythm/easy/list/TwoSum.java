package com.algorhythm.easy.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (set.containsKey(target - nums[i])) {
                return new int[]{i, set.get(target - nums[i])};
            }

            set.put(nums[i], i);

        }
        return new int[]{};
    }
}
