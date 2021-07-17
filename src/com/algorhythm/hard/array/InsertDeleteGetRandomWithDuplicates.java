package com.algorhythm.hard.array;

import java.util.*;

public class InsertDeleteGetRandomWithDuplicates {
    public static void main(String[] args) {
        InsertDeleteGetRandomWithDuplicates in = new InsertDeleteGetRandomWithDuplicates();
        in.insert(0);
        in.remove(0);
        in.insert(-1);
        in.remove(0);
        System.out.println(in.getRandom());
        System.out.println(in.getRandom());
        System.out.println(in.getRandom());
        System.out.println(in.getRandom());
        System.out.println(in.getRandom());
        System.out.println(in.getRandom());

    }
    Random random = new Random();
    List<Integer> data;
    Map<Integer, Set<Integer>> keyMap;
    /**
     * Initialize your data structure here.
     */


    /** Initialize your data structure here. */
    public InsertDeleteGetRandomWithDuplicates() {
        data = new ArrayList<>();
        keyMap = new HashMap<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        //boolean present=false;
        if (!keyMap.containsKey(val)) {
            keyMap.put(val, new HashSet<>());
        }
        //present = keyMap.get(val).isEmpty();
        keyMap.get(val).add(data.size());
        data.add(val);
        return keyMap.get(val).size()==1;
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!keyMap.containsKey(val) || keyMap.get(val).isEmpty()) {
            return false;
        }
        int removeIndex = keyMap.get(val).iterator().next();
        keyMap.get(val).remove(removeIndex);
        if(removeIndex != data.size()-1) {
            Integer lastElement = data.get(data.size() - 1);
            data.set(removeIndex, lastElement);
            keyMap.get(lastElement).remove(data.size()-1);
            keyMap.get(lastElement).add(removeIndex);
        }
        data.remove(data.size()-1);
        return true;
    }

    /** Get a random element from the collection. */
    public int getRandom() {

        return data.get(random.nextInt(data.size()));
    }
}
