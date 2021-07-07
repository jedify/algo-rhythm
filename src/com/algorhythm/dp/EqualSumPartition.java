package com.algorhythm.dp;

public class EqualSumPartition {
    public boolean findEqualSumPartitionNonContiguous(int[] arr) {
        int sum = sum(arr);
        if (sum % 2 != 0) {
            return false;
        }

        SubSetSum subSetSum = new SubSetSum();
        return subSetSum.findSubsetSum(arr, sum / 2, arr.length);
    }

    public int findEqualSumPartitionContiguous(int[] arr) {
        int sum = sum(arr);
        if (sum % 2 != 0) {
            return -1;
        }

        int runningSum = 0, i = 0;
        for (i = 0; i < arr.length; i++) {
            runningSum += arr[i];
            if (runningSum == sum / 2) {
                break;
            }
        }

        return i;
    }

    private int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

}
