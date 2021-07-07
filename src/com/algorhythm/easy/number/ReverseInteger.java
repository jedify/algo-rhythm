package com.algorhythm.easy.number;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }

    public int reverse(int x) {
        boolean isNegetive = x < 0;
        int result = 0;
        x = Math.abs(x);
        while (x > 0) {
            result = (10 * result) + (x % 10);
            x = x / 10;
        }

        if (isNegetive) {
            result = -1 * result;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return result;
    }
}
