package com.algorhythm.dp;

import com.google.gson.Gson;

public class CountOfSubsetSum {
    public static void main(String[] args) {
        new CountOfSubsetSum().countOfSubsetSum(new int[]{2, 3, 4, 5, 6, 7, 1}, 8);
    }

    public int countOfSubsetSum(int[] arr, int sum) {
        int[][] t = new int[arr.length + 1][sum + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0)
                    t[i][j] = 0;

                if (j == 0)
                    t[i][j] = 1;
            }
        }

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        System.out.println(new Gson().toJson(t));
        return t[arr.length][sum];
    }
}
