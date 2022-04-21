package com.algorhythm.medium.matrix;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{new int[]{1, 2, 3, 10}, new int[]{4, 5, 6, 11}, new int[]{7, 8, 9, 12}};
        System.out.println(new Gson().toJson(new SpiralMatrix().spiralOrder(matrix)));

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0, top = 0, cols = matrix.length, rows = matrix[0].length, right = cols-1, bottom = rows-1;
        while (result.size() < rows * cols) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            for (int i = top+1; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            if (top != bottom) {

                for (int i = right - 1; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
    }
}
