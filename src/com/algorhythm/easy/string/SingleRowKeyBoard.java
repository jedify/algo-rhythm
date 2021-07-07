package com.algorhythm.easy.string;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyBoard {

    public static void main(String[] args) {
        System.out.println(new SingleRowKeyBoard().calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> keyMap = new HashMap<>();
        int i = 0;
        while (i < keyboard.length()) {
            keyMap.put(keyboard.charAt(i), i);
            i++;
        }
        int curr = 0, totalMove=0;
        for (i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int position = keyMap.get(ch);
            totalMove += Math.abs(curr - position);
            curr = position;
        }
        return totalMove;
    }
}
