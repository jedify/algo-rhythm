package com.algorhythm.easy.array;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Integer> keyMap = new HashMap<>();
        for(int i=0;i<nums2.length;i++) {
            keyMap.put(nums2[i], i);
        }

        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            result[i] = keyMap.get(nums1[i]);
        }
        return result;
    }
}
