package com.algorhythm.hard.array;

public class UniquePathIII {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[]{1, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 2, -1}};
        System.out.println(new UniquePathIII().uniquePathsIII(arr));
    }

    public int uniquePathsIII(int[][] grid) {
        int starti = -2, startj = -2, zero = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    starti = i;
                    startj = j;
                }
                if (grid[i][j] == 0) {
                    zero++;
                }
            }
        }

        return findPath(grid, starti, startj, zero);
    }

    public int findPath(int[][] grid, int i, int j, int zero) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || (grid[i][j] == -1)) {
            return 0;
        }
        if (grid[i][j] == 2) {
            if (zero == -1)
                return 1;
            else
                return 0;
        }

        grid[i][j] = -1;
        zero -= 1;
        int result = findPath(grid, i, j - 1, zero) +
                findPath(grid, i, j + 1, zero) +
                findPath(grid, i - 1, j, zero) +
                findPath(grid, i + 1, j, zero);
        grid[i][j] = 0;
        return result;
    }
}
