package com.algorhythm.easy.number;

import java.util.ArrayList;
import java.util.List;

public class NextGreatNumberWithSameDigits {
    public static void main(String[] args) {
        System.out.println(new NextGreatNumberWithSameDigits().nextGreaterElement(2147483486));
    }

    public int nextGreaterElement(int n) {
        if (n < 11) {
            return -1;
        }
        int positionOfSmallest = 1, digit = n % 10;
        int num = n / 10;
        boolean foundSmallest = false;
        while (num > 0) {
            positionOfSmallest++;
            if (num % 10 < digit) {
                digit = num % 10;
                foundSmallest = true;
                break;
            }
            digit = num % 10;
            num = num / 10;
        }
        if (!foundSmallest) {
            return -1;
        }
        num = n % (int) Math.pow(10, positionOfSmallest - 1);
        int nextGreaterDigit = 10;
        int index = 0, positionOfNextSmallest = -1;
        while (num > 0) {
            index++;
            int currentDigit = num % 10;
            if (currentDigit > digit && currentDigit < nextGreaterDigit) {
                nextGreaterDigit = currentDigit;
                positionOfNextSmallest = index;
            }
            num = num / 10;
        }
        if (positionOfNextSmallest > -1) {
            long result = n - ((int) Math.pow(10, positionOfSmallest - 1) * digit) + ((int) Math.pow(10, positionOfSmallest - 1) * nextGreaterDigit);
            result = result - ((int) Math.pow(10, positionOfNextSmallest - 1) * nextGreaterDigit) + ((int) Math.pow(10, positionOfNextSmallest - 1) * digit);
            if (positionOfNextSmallest > 1) {
                int factor = ((int) Math.pow(10, positionOfSmallest - 1));
                long smallestPossibleNumberWithCombination = getSortedNumber(n % factor);
                result = result / factor;
                result = result * factor + smallestPossibleNumberWithCombination;
            }

            if ((result < Integer.MAX_VALUE) && (result > Integer.MIN_VALUE)) {
                return n;
            }
        }

        return -1;

    }

    private long getSortedNumber(long n) {
        long result = 0, num = n;
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add((int) num % 10);
            num = num / 10;
        }

        for (int i = 0; i < digits.size(); i++) {
            int curr = digits.get(i);
            for (int j = i + 1; j < digits.size(); j++) {
                if (digits.get(j) < curr) {
                    curr = digits.get(j);
                }
            }
            result = result * 10 + curr;
        }
        return result;
    }
}
