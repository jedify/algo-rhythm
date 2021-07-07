package com.algorhythm.easy.number;

import java.util.Map;
import java.util.TreeMap;
/**
 * https://leetcode.com/problems/integer-to-roman/
 * 
 * https://www.rapidtables.com/convert/number/how-number-to-roman-numerals.html
 * */
public class IntegerToRoman {
    private static int[] nums = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static Map<Integer, String> romanCharValue = getCharMap();

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().integerToRoman(1994));
    }
    private static Map<Integer, String> getCharMap() {
        Map<Integer, String> characterIntegerMap = new TreeMap<>();
        characterIntegerMap.put(1, "I");
        characterIntegerMap.put(4, "IV");
        characterIntegerMap.put(5, "V");
        characterIntegerMap.put(9, "IX");
        characterIntegerMap.put(10, "X");
        characterIntegerMap.put(40, "XL");
        characterIntegerMap.put(50, "L");
        characterIntegerMap.put(90, "XC");
        characterIntegerMap.put(100, "C");
        characterIntegerMap.put(400, "CD");
        characterIntegerMap.put(500, "D");
        characterIntegerMap.put(900, "CM");
        characterIntegerMap.put(1000, "M");
        return characterIntegerMap;
    }

    public String integerToRoman(int number) {
        StringBuffer result = new StringBuffer("");
        int i = nums.length - 1;
        while (number > 0 && i >= 0) {
            if (number >= nums[i]) {
                int x = number / nums[i];
                while (x > 0) {
                    result.append(romanCharValue.get(nums[i]));
                    x--;
                }
                number = number % nums[i];
            }
            i--;
        }
        return result.toString();
    }

}
