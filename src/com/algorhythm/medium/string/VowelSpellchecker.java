package com.algorhythm.medium.string;

import java.util.Arrays;
import java.util.HashSet;

public class VowelSpellchecker {
    HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'u', 'o', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        String[] words = new String[]{
                "zeo","Zuo"};
        String[] queries = new String[]{"zuo"};//, "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
        new VowelSpellchecker().spellchecker(words, queries);
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            int match=-1;
            for (int j = 0; j < wordlist.length; j++) {
                String word = wordlist[j];
                int currMatch = checkIfMatching(word, query);
                if (currMatch == 0) {
                    result[i] = word;
                    break;
                }

                if (currMatch > match) {
                    result[i] = word;
                    match = currMatch;
                }
            }
            if(match == -1) {
                result[i] = "";
            }
        }
        return result;
    }

    private int checkIfMatching(String word, String query) {
        if (word.length() != query.length()) {
            return -1;
        }
        if (word.equals(query)) {
            return 3;
        }

        if (word.equalsIgnoreCase(query)) {
            return 2;
        }

        for (int i = 0, j = 0; i < word.length() && j < query.length(); i++, j++) {
            char ch = word.charAt(i);
            char qch = query.charAt(i);
            if (vowels.contains(ch) && vowels.contains(qch)) {
                continue;
            }
            int diff = Math.abs(ch - qch);
            if (diff == 0 || diff == 32) {
                continue;
            }
            return -1;
        }
        return 1;
    }
}
