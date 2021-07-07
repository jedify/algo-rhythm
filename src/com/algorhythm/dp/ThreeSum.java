package com.algorhythm.dp;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        List<Integer> sum = new ThreeSum().sum(new Integer[]{3, 5, 6, 4, 9, 2, 8}, 10);
    }
    List<Integer> sum(Integer[] arr, int sum) {
        List<Integer>[][] result = new List[arr.length + 1][sum + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0 || j == 0) {
                    result[i][j] = new ArrayList<>();
                }
            }
        }

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i-1] <= j) {
                    result[i][j] = new ArrayList<>(result[i-1][j]);
                    result[i][j].addAll(result[i-1][j-arr[i-1]]);
                } else {
                result[i][j] = new ArrayList<>(result[i-1][j]);

                }

            }
        }

        return result[arr.length][sum];
    }
}
