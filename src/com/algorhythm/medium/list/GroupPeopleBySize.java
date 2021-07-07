package com.algorhythm.medium.list;

import java.util.*;

public class GroupPeopleBySize {
  public static void main(String[] args) {
    List x = new GroupPeopleBySize().groupThePeople(new int[]{3, 3, 3, 3, 1, 2, 2, 3, 3});
  }

  public List<List<Integer>> groupThePeople(int[] groupSizes) {
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer, List<Integer>> listMap = new HashMap<>();
    for (int i = 0; i < groupSizes.length; i++) {
      if (listMap.get(groupSizes[i]) == null) {
        listMap.put(groupSizes[i], new ArrayList<>(groupSizes[i]));
      } else {
        List<Integer> bucket = listMap.get(groupSizes[i]);
        if (bucket.size() == groupSizes[i]) {
          result.add(bucket);
          listMap.put(groupSizes[i], new ArrayList<>(groupSizes[i]));
        }
      }

      listMap.get(groupSizes[i]).add(i);
    }

    result.addAll(listMap.values());
    return result;
  }

}
