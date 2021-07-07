package com.algorhythm.easy.number;

public class SubtractProductAndSumOfDigitsOfNumber {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            product *= remainder;
            sum *= remainder;
            n = n / 10;
        }
        return product-sum;
    }
}
