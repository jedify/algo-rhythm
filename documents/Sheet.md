1. #### Next Greater/Smaller Element I: (Easy) 
   Find all greater element in an array.<br>
   Hint: Start from left, push to stack, whenever find element greater than array top, keep popping till stack is empty & top is less than current, update larger

2. #### Maximum Product Subarray: (Med)
   maintain min & max till that point, check Math.max(min*curr, max*curr, curr)

3. #### Maximum Average Subarray I or size k: (Easy) 
   _public double findMaxAverage(int[] nums, int k)_ <br>
   Sliding window