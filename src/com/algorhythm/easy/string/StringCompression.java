package com.algorhythm.easy.string;

import com.google.gson.Gson;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new StringCompression().compress(new char[]{'a','a','b','b','c','c','c'})));
    }
    public int compress(char[] chars) {
        if (chars.length == 0 || chars.length == 1) {
            return chars.length;
        }
        StringBuffer sb = new StringBuffer("");
        char prev = chars[0];
        int freq = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                freq++;
            } else {
                sb.append(prev);
                if (freq > 1)
                    sb.append(freq);
                freq=1;
            }
            prev = chars[i];
        }
        sb.append(prev);
        if (freq > 1)
            sb.append(freq);
        for(int i=0;i<sb.length();i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
