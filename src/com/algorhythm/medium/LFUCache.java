package com.algorhythm.medium;

import java.util.*;

public class LFUCache {
    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        lfuCache.get(1);
        lfuCache.put(3, 3);
        lfuCache.get(2);
        lfuCache.get(3);
        lfuCache.put(4, 4);
        lfuCache.get(1);
        lfuCache.get(3);
        lfuCache.get(4);
    }

    Map<Integer, Integer> cache = new LinkedHashMap<>();
    Map<Integer, Integer> frequency = new HashMap<>();
    int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Remove the key, if value is not null, reinsert the (key,value) as it remains on the tail of the linkedList update the frequency, else return -1.
     * */
    public int get(int key) {
        Integer value = cache.remove(key);
        if (value != null) {
            this.cache.put(key, value);
            frequency.put(key, frequency.get(key) + 1);
            return value;
        }
        return -1;
    }

    /**
     * Check if the cache has the key, Update the key value
     **/
    public void put(int key, int value) {
        if (capacity <= 0) {
            return;
        }
        if (cache.containsKey(key)) {
            cache.put(key, value);
            frequency.put(key, frequency.get(key) + 1);
            return;
        }

        if (cache.size() == this.capacity) {
            int itemToBeRemoved = findLFUEntry();
            cache.remove(itemToBeRemoved);
            frequency.remove(itemToBeRemoved);
        }

        cache.put(key, value);
        frequency.put(key, 0);
    }

    private int findLFUEntry() {
        Map<Integer, Integer> entries = new HashMap<>();
        int minFrequency = Integer.MAX_VALUE;
        Iterator<Map.Entry<Integer, Integer>> iterator = this.frequency.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() < minFrequency) {
                minFrequency = entry.getValue();
                entries.clear();
                entries.put(entry.getKey(), entry.getValue());
                continue;
            }

            if (entry.getValue() == minFrequency) {
                entries.put(entry.getKey(), entry.getValue());
            }
        }
        if (entries.size() == 1) {
            return entries.entrySet().stream().findFirst().get().getKey();
        }
        Integer keyToRemove = null;
        Iterator<Map.Entry<Integer, Integer>> cacheEntryIterator = this.cache.entrySet().iterator();
        while (cacheEntryIterator.hasNext() || !entries.isEmpty()) {
            Map.Entry<Integer, Integer> entry = cacheEntryIterator.next();
            if (entries.get(entry.getKey()) != null) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        return keyToRemove;
    }
}
