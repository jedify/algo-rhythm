### Medium Problems

1. Find the Duplicate Number

   Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.<br>
   There is only one repeated number in nums, return this repeated number.<br>

   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/find-the-duplicate-number/ <br>
   [Solution](../src/com/algorhythm/medium/list/FindTheDuplicateNumber.java)
   </details>

2. Delete Leaves With a Given Value

   Given a binary tree root and an integer target, delete all the leaf nodes with value target. <br>
   Note that once you delete a leaf node with value target, if it's parent node becomes a leaf node and has the value target, it should also be deleted (you need to continue doing that until you can't).<br>
   ![Alt text](images/deleteleaves.png?raw=true "Binary Tree")
   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/delete-leaves-with-a-given-value/ <br>
   [Solution](../src/com/algorhythm/medium/tree/RemoveLeafNode.java)
   </details>

3. Valid Soduku
   Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:<br>
   
   Each row must contain the digits 1-9 without repetition.<br>
   Each column must contain the digits 1-9 without repetition.<br>
   Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.<br>
   ![img.png](images/sudoku.png)
   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/valid-sudoku/ <br>
   [Solution](../src/com/algorhythm/medium/matrix/ValidSoduku.java)
   </details>

4. Container With Most Water
   Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.<br>
   Notice that you may not slant the container.
   ![img.png](images/container.png)
   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/container-with-most-water/ <br>
   [Solution](../src/com/algorhythm/medium/list/ContainerWithMostWater.java)
   </details>
   
5. Product of Array Except Self
   Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. <br>
   The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.<br>
   You must write an algorithm that runs in O(n) time and without using the division operation.
   <details>
   <summary> Hint/ Solution Detail </summary>

   Refer: https://leetcode.com/problems/product-of-array-except-self/ <br>
   [Solution](../src/com/algorhythm/medium/list/ProductOfArrayExceptSelf.java)
   </details>