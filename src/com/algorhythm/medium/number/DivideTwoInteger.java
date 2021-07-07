package com.algorhythm.medium.number;

public class DivideTwoInteger {
  public static void main(String[] args) {
    System.out.println(new DivideTwoInteger().divide(-1
            , 2));
  }

  public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }
    int signedPart = (dividend < 0 ^ divisor < 0) ? -1 : 1;
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);
    int result = 0;
    while (dividend > 0) {
      System.out.println(dividend);
      dividend -= divisor;
      result++;
    }
    return result * signedPart;
  }
}
