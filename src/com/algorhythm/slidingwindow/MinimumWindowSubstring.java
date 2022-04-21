/*
package com.algorhythm.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public int findMinimumWindowSubstring(String str, String sub) {
        Map<Character, Integer> charMap = new HashMap<>();
        int count=0;
        for (Character ch : sub.toCharArray()) {
            charMap.putIfAbsent(ch, 0);
            charMap.put(ch, charMap.get(ch) + 1);
            count++;
        }

        int i = 0, j = 0, size = 0, start = 0;
        while (j < str.length()) {
            Character ch = charMap.get(str.charAt(j));
            if(ch ==null ||) {
                j++;
                continue;
            }
            if() {
                charMap.
            }
            if (count==0) {
                if (j - i + 1 < size) {
                    size = j - 1 + 1;
                    start = i;
                }
            }

        }
    }
}
*/
