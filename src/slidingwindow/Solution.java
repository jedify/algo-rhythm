package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int findSumOfMaxiFromN(int[] input, int i) {
    int position = 0;
    int a = 0, b = 0, sum = 0;
    while (b < i) {
      sum = sum + input[b];
      b++;
    }
    int maxSum = sum;
    System.out.println("MaxSum : " + maxSum + ", Position: " + position);
    while (b < input.length - 1) {
      sum = sum - input[a++] + input[b++];
      if (sum > maxSum) {
        position = a;
        maxSum = sum;
        System.out.println("MaxSum : " + maxSum + ", Position: " + position);
      }
    }
    return position;
  }

  public int[] findWindowHavingSum(int[] input, int sum) {
    int i = 0, j = 0, runningSum = 0;
    while (runningSum <= sum) {
      runningSum = runningSum + input[j++];
    }
    while (j < input.length) {
      if (runningSum == sum) {
        return slice(input, i, j);
      }
      if (runningSum > sum) {
        runningSum = runningSum - input[i++];
      }
      if (runningSum < sum) {
        runningSum = runningSum + input[j++];
      }
    }
    return new int[]{};
  }

  public Object[] findAllWindowHavingSum(int[] input, int sum) {
    int i = 0, j = 0, runningSum = 0, resultIndex = 0;
    List<int[]> result = new ArrayList<>();
    while (runningSum <= sum) {
      runningSum = runningSum + input[j++];
    }
    while (j < input.length) {
      if (runningSum == sum) {
        result.add(slice(input, i, j));
        runningSum = runningSum - input[i++];
      }
      if (runningSum > sum) {
        runningSum = runningSum - input[i++];
      }
      if (runningSum < sum) {
        runningSum = runningSum + input[j++];
      }
    }
    return result.toArray();
  }

  private int[] slice(int[] input, int start, int end) {
    int[] result = new int[end - start];
    int i = 0;
    while (i < (end - start)) {
      result[i] = input[start + i++];
    }
    return result;
  }
}
