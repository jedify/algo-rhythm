package com.algorhythm.medium.string;

import java.util.Stack;
/*   *****
* "(((((()))))))(((((())*)))()))(()((*()*(*)))(*)()"
*
* */
public class ValidParenthesisString {
    public static void main(String[] args) {
        System.out.println(new ValidParenthesisString().checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
    }
    public boolean checkValidString(String s) {
        int starCount=0, leftCount=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '*') {
                starCount++;
                continue;
            }
            if(ch == '(') {
                leftCount++;
                continue;
            }

            if(ch == ')') {
                if(leftCount<1 && starCount<1) {
                    return false;
                }
                if(leftCount<1) {
                    starCount--;
                    continue;
                }
                leftCount--;
            }
        }
        if(leftCount>0) {
            return leftCount  == starCount;
        }
        return leftCount==0;
    }
}
