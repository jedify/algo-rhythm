package com.algorhythm.easy.array;

import com.google.gson.Gson;

import java.util.Stack;

/**
 * You are given two integer arrays nums1 and nums2 both of unique elements, where nums1 is a subset of nums2.
 * <p>
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
 * If it does not exist, return -1 for this number.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 * <p>
 * https://leetcode.com/problems/next-greater-element-i/
 */

public class NextGreaterElementInCircularArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 1};
        int[] result = new NextGreaterElementInCircularArray().nextGreaterElementUsingStack(arr);
        System.out.println(new Gson().toJson(result));
    }

    public int[] nextGreaterElementUsingStack(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int i = 1;
        while (i < n * 2) {
            while (!stack.isEmpty() && (nums[stack.peek()] < nums[i % n])) {
                result[stack.pop()] = nums[i % n];
            }

            stack.push(i % n);
            i++;
        }
        return result;
    }
}
