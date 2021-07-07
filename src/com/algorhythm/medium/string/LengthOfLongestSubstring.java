package com.algorhythm.medium.string;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
  public int lengthOfLongestSubstring(String s) {
    Map<Character, Boolean> traversedMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if(traversedMap.get(s.charAt(i)) !=null) {
        return traversedMap.size();
      }

    }
    return 0;
  }
}
