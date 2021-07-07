package com.algorhythm.easy.string;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
  public int numJewelsInStones(String J, String S) {
    Map<Character, Integer> frequency = new HashMap<>();
    for (int i = 0; i < S.length(); i++) {
      if (frequency.get(S.charAt(i)) != null) {
        frequency.put(S.charAt(i), frequency.get(S.charAt(i)) + 1);
      } else {
        frequency.put(S.charAt(i), 1);
      }
    }
    int jewelCount = 0;
    for (int i = 0; i < J.length(); i++) {
      if (frequency.get(J.charAt(i)) != null) {
        jewelCount += frequency.get(J.charAt(i));
      }
    }

    return jewelCount;
  }
}
