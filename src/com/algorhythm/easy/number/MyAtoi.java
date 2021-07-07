package com.algorhythm.easy.number;

public class MyAtoi {
    private static final int NUM_0 = 48;
    private static final int NUM_9 = 57;
    private static final int SPACE = 32;
    private static final int PLUS = 43;
    private static final int MINUS = 45;

    public static void main(String[] args) {
        System.out.println(new MyAtoi().myAtoi("    -42"));
    }
    public int myAtoi(String s) {
        StringBuffer result = new StringBuffer("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= NUM_0 && ch <= NUM_9) {
                result.append(ch);
                continue;
            }
            if(ch == PLUS || ch == MINUS) {
                if(result.length() > 0) {
                    break;
                }
                result.append(ch);
                continue;
            }
            if(ch == SPACE && result.length()>0) {
                break;
            }
            if(ch != SPACE) {
                break;
            }
        }
        if((result.length() == 0) || (result.length()==1 && (result.charAt(0) == PLUS || result.charAt(0) == MINUS))) {
            return 0;
        }
        long resultL = Long.parseLong(result.toString());
        if (resultL > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (resultL < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) resultL;
    }
}
