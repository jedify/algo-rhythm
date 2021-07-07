package com.algorhythm.medium.backtracking;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
/**
 * <p>Generate Parenthesis:</p>
 * <p><b>Backtrack:</b> take two index pointer for each open and close parenthesis, the parenthesis are valid as long as \n
 * start parenthesis are more than the closed parenthesis, backtrack for same combination, for each keep generating new with already valid content
 * </p>
 *
 * https://leetcode.com/problems/generate-parentheses/
 * **/
public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new GenerateParenthesis().generateParenthesis(3)));
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(0, 0, n, new StringBuffer(""), result);
        return result;
    }

    private void backtrack(int start, int end, int n, StringBuffer sb, List<String> result) {
        if (sb.length() == n * 2) {
            result.add(sb.toString());
            return;
        }

        if (start < n) {
            backtrack(start + 1, end, n, new StringBuffer(sb).append("("), result);
        }

        if (end < start) {
            backtrack(start, end + 1, n, new StringBuffer(sb).append(")"), result);
        }
    }
}
