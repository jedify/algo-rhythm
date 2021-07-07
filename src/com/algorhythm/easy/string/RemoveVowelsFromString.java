package com.algorhythm.easy.string;

import java.util.HashMap;
import java.util.Map;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        System.out.println(new RemoveVowelsFromString().removeVowels("suhjikg be"));
    }
    private static Map<Character, Boolean> UNWANTED_CHARS = new HashMap();
    static {
        UNWANTED_CHARS.put('a', true);
        UNWANTED_CHARS.put('e', true);
        UNWANTED_CHARS.put('i', true);
        UNWANTED_CHARS.put('o', true);
        UNWANTED_CHARS.put('u', true);
    }
    public String removeVowels(String s) {
        StringBuffer result = new StringBuffer();
        for(int i=0;i<s.length();i++) {

            if(UNWANTED_CHARS.get(s.charAt(i)) == null) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
