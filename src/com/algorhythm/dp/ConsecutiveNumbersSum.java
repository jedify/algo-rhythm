package com.algorhythm.dp;

public class ConsecutiveNumbersSum {
    public static void main(String[] args) {
        System.out.println(new ConsecutiveNumbersSum().consecutiveNumbersSum(933320757));
    }

    public int consecutiveNumbersSum(int n) {
        if(n==1) {
            return 1;
        }
        int i = 0, sum = 0, total = 0;
        for (int j = 1; j <= n; j++) {
            sum += j;
            if (sum > n) {
                while (sum > n) {
                    sum = sum - i;
                    i++;
                }
            }

            if (sum == n) {
             /*   for(int k=i;k<=j;k++) {
                    System.out.print(k +" ");
                }
                System.out.println("");*/
                total++;
            }
        }
        return total;
    }
}
