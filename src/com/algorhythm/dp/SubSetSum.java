package com.algorhythm.dp;

public class SubSetSum {
    public static void main(String[] args) {
        System.out.println(new SubSetSum().findSubSetSumMatrics(new int[]{1, 2, 5}, 4, 3));
    }

    /**Brute force **/
    public boolean findSubsetSum(int arr[], int sum, int n) {
        if (sum == 0) {
            return true;
        }
        if (n == 0 && sum != 0) {
            return false;
        }
        if (arr[n - 1] <= sum) {
            return findSubsetSum(arr, sum - arr[n - 1], n - 1) || findSubsetSum(arr, sum, n - 1);
        }

        return findSubsetSum(arr, sum, n - 1);
    }

    /**DP using matrix **/
    public boolean findSubSetSumMatrics(int arr[], int sum, int n) {
        boolean[][] t = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i-1][j - arr[i - 1]] || t[i - 1][j];
                } else {

                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
