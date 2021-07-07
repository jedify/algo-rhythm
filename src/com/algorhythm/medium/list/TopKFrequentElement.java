package com.algorhythm.medium.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequencyMap = new HashMap();
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int frequency = 1;
      if (frequencyMap.containsKey(nums[i])) {
        frequency = frequencyMap.get(nums[i]) + 1;
      }
      frequencyMap.put(nums[i], frequency);
      if (frequency == 2) {
        result.add(nums[i]);
      }
    }
    int[] resultArr = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      resultArr[i] = result.get(i);
    }
    return resultArr;
  }
}
