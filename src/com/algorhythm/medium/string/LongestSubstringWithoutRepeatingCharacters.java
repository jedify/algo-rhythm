package com.algorhythm.medium.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right=0;
        int maxLength = 0;
        int[] charFrequency = new int[128];
        while (right < s.length()) {
            Character curr = s.charAt(right);
            charFrequency[curr]++;
            while(charFrequency[curr] > 1) {
                char leftChar = s.charAt(left);
                charFrequency[leftChar]--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}
