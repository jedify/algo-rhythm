package com.algorhythm.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoAnyOrderArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> numMap = new HashMap<>();
        for (int i : nums1) {
            numMap.put(i, false);
        }

        for (int j : nums2) {
            if (numMap.containsKey(j)) {
                numMap.put(j, true);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Boolean> entry : numMap.entrySet()) {
            if (entry.getValue()) {
                res.add(entry.getKey());
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (Integer key : res) {
            result[i++] = key;
        }
        return result;
    }
}
