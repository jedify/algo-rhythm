package com.algorhythm.easy.sort;

import com.google.gson.Gson;

public class QuickSort {
    public static void main(String[] args) {
        new QuickSort().sort(new int[] {3, 2, 5, 6, 1, 4, 10}, 0, 7);
    }
    public void sort(int[] arr, int low, int high) {
        int pivotIndex = low;
        int pivot = arr[low];
        for (int i = low + 1; i < high; i++) {
            if (pivot > arr[i]) {
                int temp = arr[i];
                arr[i] = pivot;
                arr[pivotIndex] = temp;
                pivotIndex = i;
                
            }
        }

        sort(arr, low, pivotIndex - 1);
        sort(arr, pivotIndex + 1, high);
        System.out.println(new Gson().toJson(arr));
    }
}
