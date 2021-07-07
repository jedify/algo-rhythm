package com.algorhythm.easy.array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                i++;
            }

            if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        int[] res = new int[result.size()];
        for (Integer integer : result) {
            res[i++] = integer;
        }
        return res;
    }
}
