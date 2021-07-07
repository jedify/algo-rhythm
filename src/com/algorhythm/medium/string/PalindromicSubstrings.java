package com.algorhythm.medium.string;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        new PalindromicSubstrings().countSubstrings("aaa");
    }
    public int countSubstrings(String s) {
        List<String> pallindroms = new ArrayList<>();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j + i <= s.length(); j++) {
                String sub = s.substring(j, j+i);
                if (isPallindrom(sub))
                    pallindroms.add(sub);
            }
        }
        System.out.println(new Gson().toJson(pallindroms));
        return pallindroms.size();
    }

    private boolean isPallindrom(String sub) {
        for (int i = 0, j = sub.length() - 1; i < sub.length(); i++, j--) {
            if (sub.charAt(i) != sub.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
