package com.algorhythm.medium.backtracking;

import com.algorhythm.hard.array.UniquePathIII;

public class UniquePathsII {
    public static void main(String[] args) {
        System.out.println(new UniquePathsII().uniquePathsWithObstacles(new int[][]{new int[]{0, 0, 0}, new int[]{0, 1, 0}, {0, 0, 0}}));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int zero = 0;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 0) {
                    zero++;
                }
            }
        }
        return path(obstacleGrid, 0, 0, zero);
    }

    private int path(int[][] grid, int i, int j, int zero) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == 1) {
            return 0;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1 && grid[i][j] == 0) {
            if(zero == 0)
                return 1;
            else
                return 0;
        }

        grid[i][j] = 1;
        int cnt = path(grid, i, j - 1, zero - 1) + path(grid, i, j + 1, zero - 1) + path(grid, i - 1, j, zero - 1) + path(grid, i + 1, j, zero - 1);

        grid[i][j] = 0;
        return cnt;
    }
}
