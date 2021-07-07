package com.algorhythm.easy.list;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = candies[0];
    List<Boolean> result = new ArrayList<>();
    for (int i = 1; i < candies.length; i++) {
      if (max < candies[i]) {
        max = candies[i];
      }
    }
    for (int i = 0; i < candies.length; i++) {
      result.add(candies[i]+extraCandies >= max);
    }
    return result;

  }
}
