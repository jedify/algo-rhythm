package com.algorhythm.easy.array;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] input = new int[]{4, 6, 8, 10, 0, 2, 3};
        System.out.println(new SearchInRotatedSortedArray().search(input, 2));
    }

    public int search(int[] nums, int target) {

        int pivot = findPivot(nums, 0, nums.length - 1);
        if (pivot == -1) {
            findIndex(nums, 0, nums.length - 1, target);
        }
        if (nums[pivot] > target && target>nums[0])
            return findIndex(nums, 0, pivot - 1, target);
        if (nums[pivot] < target && nums[pivot]<target)
            return findIndex(nums, pivot + 1, nums.length - 1, target);

        return pivot;
    }

    private int findIndex(int[] nums, int start, int end, int target) {
        int left = start, right = end;
        while (left <= right) {
            if (nums[left] == target) {
                return left;
            }

            if (nums[right] == target) {
                return right;
            }

            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid;
            }
            return mid;
        }

        return -1;
    }


    private int findPivot(int[] nums, int left, int right) {
        if (right < left) {
            return -1;
        }

        if (left == right)
            return left;

        int mid = left + right / 2;
        if (mid < right && nums[mid] > nums[mid + 1]) {
            return mid;
        }

        if (mid > left && nums[mid] < nums[mid - 1]) {
            return mid - 1;
        }

        if (nums[left] > nums[mid]) {
            return findPivot(nums, left, mid - 1);
        }

        return findPivot(nums, mid + 1, right);
    }
}
