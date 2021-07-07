package com.algorhythm.easy.number;

import java.util.HashMap;
import java.util.Map;
/**
 * https://leetcode.com/problems/roman-to-integer/
 * */
public class RomanToInteger {
    private static Map<Character, Integer> romanCharValue = getCharMap();

    private static Map<Character, Integer> getCharMap() {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('X', 10);
        characterIntegerMap.put('L', 50);
        characterIntegerMap.put('C', 100);
        characterIntegerMap.put('D', 500);
        characterIntegerMap.put('M', 1000);
        return characterIntegerMap;
    }

    public int convert(String roman) {
        int value = 0;
        int i = 0;
        while (i < roman.length()) {
            int charVal = RomanToInteger.romanCharValue.get(roman.charAt(i));
            if ((i + 1) < roman.length()) {
                int nextCharVal = RomanToInteger.romanCharValue.get(roman.charAt(i + 1));
                if (nextCharVal > charVal) {
                    charVal = nextCharVal - charVal;
                    i++;
                }
            }
            i++;
            value = value + charVal;
        }
        return value;
    }

}
