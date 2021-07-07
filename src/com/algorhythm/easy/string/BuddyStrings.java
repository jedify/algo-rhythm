package com.algorhythm.easy.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * https://leetcode.com/problems/buddy-strings/
 * <p>
 * Given two strings a and b, return true if you can swap two letters in a so the result is equal to b, otherwise, return false.
 * <p>
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at a[i] and b[j]. For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 */
public class BuddyStrings {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int i = 0;
        List<Integer> differIndices = new ArrayList<>();
        char[] charArrayA = new char[a.length()];
        while (i < a.length() && differIndices.size() < 3) {
            charArrayA[i] = a.charAt(i);
            if (a.charAt(i) != b.charAt(i)) {
                differIndices.add(i);
            }
            i++;
        }

        if (differIndices.size() == 2) {
            char tempChar = charArrayA[differIndices.get(0)];
            charArrayA[differIndices.get(0)] = charArrayA[differIndices.get(1)];
            charArrayA[differIndices.get(1)] = tempChar;
            return b.equals(new String(charArrayA));
        }

        if (differIndices.size() == 0) {
            return checkforAnyDuplicate(charArrayA);
        }

        return false;
    }

    private boolean checkforAnyDuplicate(char[] charArrayA) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < charArrayA.length; i++) {
            if (charFrequency.get(charArrayA[i]) != null) {
                return true;
            }
            charFrequency.put(charArrayA[i], 1);
        }
        return false;
    }
}
