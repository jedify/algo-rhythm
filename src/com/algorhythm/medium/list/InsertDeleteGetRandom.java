package com.algorhythm.medium.list;

import java.util.*;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        System.out.println(new Random().nextInt(0));
    }
    Random random = new Random();
    /**
     * Initialize your data structure here.
     */
    List<Integer> data;
    Map<Integer, Integer> keyMap;

    public InsertDeleteGetRandom() {
        data = new ArrayList<>();
        keyMap = new HashMap<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (keyMap.containsKey(val)) {
            return false;
        }
        keyMap.put(val, data.size());
        data.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!keyMap.containsKey(val)) {
            return false;
        }
        int index = keyMap.get(val);
        if (index < data.size() - 1) {
            data.set(index, data.get(data.size() - 1));
            keyMap.put(data.get(index), index);
        }
        data.remove(data.size() - 1);
        keyMap.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {

        return data.get(random.nextInt(data.size()));
    }
}
