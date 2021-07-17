package com.algorhythm.medium.matrix;

import java.util.HashSet;

public class ValidSoduku {
    public static void main(String[] args) {
        char[][] chars = new char[9][9];
        new ValidSoduku().isValidSudoku(chars);
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
               if (board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !cols.add(board[j][i])) {
                    return false;
                }


                int row =(3*(i / 3) + j / 3 );
                int col = (3*(i % 3) + j % 3 );
                if (board[row][col] != '.' && !cube.add(board[row][col])) {
                    return false;
                }
            }
        }
        return true;
    }
}
