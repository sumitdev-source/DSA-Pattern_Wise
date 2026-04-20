/* Medium
Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
*/

package two_pointer_ques;

import java.util.Arrays;

public class LC_16 {
  public int threeSumClosest(int[] nums, int target) {

    // Step 1: Sort the array (so we can use two pointers easily)
    Arrays.sort(nums);

    // Step 2: Assume first 3 elements ka sum hi closest hai
    int closest = nums[0] + nums[1] + nums[2];

    // Step 3: Loop to fix one number (nums[i])
    for (int i = 0; i < nums.length - 2; i++) {

        // Two pointers start
        int left = i + 1;              // next element after i
        int right = nums.length - 1;  // last element

        // Step 4: Find best pair using two pointer
        while (left < right) {

            // Current sum of 3 numbers
            int sum = nums[i] + nums[left] + nums[right];

            // Step 5: Check if this sum is closer to target
            // Compare current sum and previous closest
            if (Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum; // update closest if better
            }

            // Step 6: Move pointers based on comparison
            if (sum < target) {
                // Sum is small → need bigger value → move left forward
                left++;
            } else if (sum > target) {
                // Sum is large → need smaller value → move right backward
                right--;
            } else {
                // Perfect match mil gaya (exact target)
                return sum;
            }
        }
    }

    // Step 7: Return the closest sum found
    return closest;
 }

  public static void main(String[] args) {

        LC_16 obj = new LC_16();

        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int result = obj.threeSumClosest(nums, target);

        System.out.println("Closest sum is: " + result);
    }
}


/*
In short = Fix 1 number + find 2 numbers using two pointer + keep updating closest sum

Flow ;

First, we sort the given array so that we can use the two-pointer technique easily.

Then, we assume that the sum of the first three elements is our initial closest answer.

Now, we run a loop from index 0 to n-3. This loop is used to fix one element at a time.

For every element, we take two pointers:
left pointer just after the current element (i + 1)
right pointer at the end of the array (n - 1)

Run a loop while left < right. This means we will keep checking pairs until both pointers meet.

Inside the loop, calculate the sum of three elements:
nums[i] + nums[left] + nums[right]

Now, compare this sum with the current closest value:
If this sum is closer to the target (using Math.abs),
then update the closest value.

If the sum is less than target:
move the left pointer forward because we need a bigger value.

If the sum is greater than target:
move the right pointer backward because we need a smaller value.

If the sum is exactly equal to target:
return this sum immediately because this is the best possible answer.

Repeat this process until left and right cross each other.

Continue this for all elements in the loop.

At last, return the closest value which is the sum nearest to the target.
*/


