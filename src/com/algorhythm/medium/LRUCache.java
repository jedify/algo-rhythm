package com.algorhythm.medium;

import com.google.gson.Gson;

import java.util.*;

public class LRUCache {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        System.out.println(lruCache.get(2));
        lruCache.put(2, 6);
        System.out.println(lruCache.get(1));
        lruCache.put(1, 5);
        lruCache.put(1, 2);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }

    int capacity;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = this.cache.remove(key);
        if (value != null) {
            this.cache.put(key, value);
            return value;
        }
        return -1;

    }

    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            this.cache.remove(key);
            this.cache.put(key, value);
            return;
        }

        if (cache.size() < capacity) {
            this.cache.put(key, value);
        } else {
            Map.Entry<Integer, Integer> firstElement = this.cache.entrySet().stream().findFirst().get();
            this.cache.remove(firstElement.getKey());
            this.cache.put(key, value);
        }
    }
}
