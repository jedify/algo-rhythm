package com.algorhythm.medium.list;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxArea = 0;
        while (i < j) {
            int currentArea = (j-i) * Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, currentArea);
            if(height[i]<height[j]) {
                i++;
            }else {
                j--;
            }
        }

        return maxArea;
    }
}
