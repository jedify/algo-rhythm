## Easy Problems

1. #### Two Sum
   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.<br>
   You may assume that each input would have exactly one solution, and you may not use the same element twice.

   <details>
   <summary> Hint/ Solution Detail </summary>

   Hint: Process each, put it in a map with index, check for target-value is present return else empty <br>
   Refer: https://leetcode.com/problems/two-sum <br>
   Solution: [Answer](../src/com/algorhythm/easy/list/TwoSum.java)
   </details>

2. #### Reverse Integer
   Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0
 
   <details>
   <summary> Hint/ Solution Detail </summary>

    https://leetcode.com/problems/reverse-integer/ <br>
   [Solution](../src/com/algorhythm/easy/number/ReverseInteger.java)
   </details>

3. #### Roman to Integer

   <details>
   <summary> Hint/ Solution Detail </summary>

   https://leetcode.com/problems/roman-to-integer/ <br>
   [Solution](../src/com/algorhythm/easy/number/RomanToInteger.java)
   </details>

4. #### Valid Parentheses
   Given a string s containing just the characters '(', ')', '{', '}', '\[' and '\]', determine if the input string is valid.
   
   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/valid-parentheses/ <br>
   [Solution](../src/com/algorhythm/easy/stack/ValidParenthesis.java)
   </details>

5. #### Merge Two Sorted Lists
   Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
   
   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/merge-two-sorted-lists/ <br>
   Solution: [Answer](../src/com/algorhythm/easy/list/MergeTwoSortedLists.java)
   </details>

6. #### Merge Sorted Array
   You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.<br>

   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/merge-sorted-array/ <br>
   [Solution](../src/com/algorhythm/easy/list/MergeSortedArray.java)
   </details>

7. #### Binary Tree Inorder Traversal
   Given the root of a binary tree, return the inorder traversal of its nodes' values. <br>

   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/binary-tree-inorder-traversal/ <br>
   [Solution](../src/com/algorhythm/easy/tree/BinaryTreeInorderTraversal.java)
   </details>

8. #### Same Tree
   Given the roots of two binary trees p and q, write a function to check if they are the same or not. <br>

   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/same-tree/ <br>
   [Solution](../src/com/algorhythm/easy/tree/SameTree.java)
   </details>

9. #### Symmetric Tree
   Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center). <br>

   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/symmetric-tree/ <br>
   [Solution](../src/com/algorhythm/easy/tree/SymmetricTree.java)
   </details>

10. #### Max Depth Of Binary Tree
   Given the root of a binary tree, return its maximum depth.<b
   A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/maximum-depth-of-binary-tree/ <br>
   [Solution](../src/com/algorhythm/easy/tree/MaxDepthBinaryTree.java)
   </details>   

11. #### Balanced Binary Tree
   Given a binary tree, determine if it is height-balanced.<br>
   For this problem, a height-balanced binary tree is defined as:<br>
   `a binary tree in which the left and right subtrees of every node differ in height by no more than 1.`
   
   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/balanced-binary-tree/ <br>
   [Solution](../src/com/algorhythm/easy/tree/BalancedBinaryTree.java)
   </details>   

11. #### Minimum Depth of Binary Tree
   Given a binary tree, find its minimum depth.<br>
   The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.<br>
   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/minimum-depth-of-binary-tree/ <br>
   [Solution](../src/com/algorhythm/easy/tree/MinDepthOfBinaryTree.java)
   </details>   

11. #### Binary Tree Path Sum
   Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.<br>
   `A leaf is a node with no children.`

   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/path-sum/ <br>
   [Solution](../src/com/algorhythm/easy/tree/PathSum.java)
   </details>   

11. #### Best Time to Buy and Sell Stock
   You are given an array prices where prices[i] is the price of a given stock on the ith day.<br>
   You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.<br>
   Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
   
   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ <br>
   [Solution](../src/com/algorhythm/easy/array/BestTimeToBuyAndSellStock.java)
   </details>   

12. #### Single Number
   Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.<br>
   `You must implement a solution with a linear runtime complexity and use only constant extra space.`

   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ <br>
   [Solution](../src/com/algorhythm/easy/array/BestTimeToBuyAndSellStock.java)
   </details>   

13. #### Linked List Cycle
   Given head, the head of a linked list, determine if the linked list has a cycle in it.<br>
   There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.<br>

   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/linked-list-cycle/ <br>
   [Solution](../src/com/algorhythm/easy/list/LinkedListCycle.java)
   </details>   

14. #### Min Stack
   Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
   
   Implement the MinStack class:
   ```
   - MinStack() initializes the stack object.<br>
   - void push(val) pushes the element val onto the stack. <br>
   - void pop() removes the element on the top of the stack.<br>
   - int top() gets the top element of the stack.<br>
   - int getMin() retrieves the minimum element in the stack.<br>
   ```
   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/min-stack/ <br>
   [Solution](../src/com/algorhythm/easy/list/MinStack.java)
   </details>   

15. #### Climb Stairs
   You are climbing a staircase. It takes n steps to reach the top.
   <br>
   Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/climbing-stairs/ <br>
   [Solution](../src/com/algorhythm/dp/ClimbStairs.java)
   </details>   

16. #### Next Greater Element I
   The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.<br>
   You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.<br>
   For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.<br>
   Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.<br>
   <details>
   <summary> Hint/ Solution Detail </summary>
   
   Refer: https://leetcode.com/problems/next-greater-element-i/ <br> 
   [Solution](../src/com/algorhythm/easy/array/NextGreaterElement.java)
   </details>

17. Maximum Average Subarray I
    You are given an integer array nums consisting of n elements, and an integer k.<br>
    Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
    <details>
    <summary> Hint/ Solution Detail </summary>

    Refer: https://leetcode.com/problems/maximum-average-subarray-i/ <br>
    [Solution](../src/com/algorhythm/easy/array/MaximumAverageSubarrayI.java)
    </details>