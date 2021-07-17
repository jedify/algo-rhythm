package com.algorhythm.medium.list;

import java.util.*;

public class TopKFrequentElement {
    /**
     * Using PriorityQueue
     **/
    public int[] topKFrequentPriorityQueue(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int frequency = 1;
            if (frequencyMap.containsKey(nums[i])) {
                frequency = frequencyMap.get(nums[i]) + 1;
            }
            frequencyMap.put(nums[i], frequency);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(entry);
        }

        int[] result = new int[k];

        int cnt = 0;
        while (cnt != k) {
            result[cnt++] = priorityQueue.poll().getKey();
        }
        return result;
    }

    /**
     * Using Brute Force
     **/
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int frequency = 1;
            if (frequencyMap.containsKey(nums[i])) {
                frequency = frequencyMap.get(nums[i]) + 1;
            }
            frequencyMap.put(nums[i], frequency);
        }

        Map<Integer, Set<Integer>> invertedFrequencyMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (!invertedFrequencyMap.containsKey(entry.getValue())) {
                invertedFrequencyMap.put(entry.getValue(), new HashSet<>());
            }
            invertedFrequencyMap.get(entry.getValue()).add(entry.getKey());
        }
        Integer[] sortedKeys = new Integer[invertedFrequencyMap.size()];
        invertedFrequencyMap.keySet().toArray(sortedKeys);
        Arrays.sort(sortedKeys);
        int[] result = new int[k];
        int cnt = 0, i = sortedKeys.length - 1;
        while (cnt < k) {
            for (Integer key : invertedFrequencyMap.get(sortedKeys[i])) {
                if (cnt == k) {
                    break;
                }
                result[cnt++] = key;
            }
            i--;
        }
        return result;
    }
}
