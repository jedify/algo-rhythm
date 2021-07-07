package com.algorhythm.easy.array;

/**
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.
 * At the end, return the modified image.
 **/
public class FloodFill {
  public static void main(String[] args) {
    int[][] image = new int[3][3];
    image[0] = new int[]{1, 1, 1};
    image[1] = new int[]{1, 1, 0};
    image[2] = new int[]{1, 0, 1};
    FloodFill floodFill = new FloodFill();
    floodFill.floodFill(image, 1, 1, 2);
  }

  private int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    boolean[][] processed = new boolean[3][3];
    floodFillAdjacent(image, processed, sr, sc, image[sr][sc], newColor);
    return image;
  }

  private void floodFillAdjacent(int[][] image, boolean[][] processed, int sr, int sc, int oldValue, int newColor) {
    if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
      return;
    }

    if ((oldValue != image[sr][sc]) || (processed[sr][sc] == true)) {
      return;
    }
    image[sr][sc] = newColor;
    processed[sr][sc] = true;
    floodFillAdjacent(image, processed, sr - 1, sc, oldValue, newColor);
    floodFillAdjacent(image, processed, sr + 1, sc, oldValue, newColor);
    floodFillAdjacent(image, processed, sr, sc - 1, oldValue, newColor);
    floodFillAdjacent(image, processed, sr, sc + 1, oldValue, newColor);
  }
}
