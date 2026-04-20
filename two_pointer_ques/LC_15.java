/* Medium 
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105

*/


package two_pointer_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_15 {
  public List<List<Integer>> threeSum(int[] nums) {

        // final answer list (store all triplets)
        List<List<Integer>> result = new ArrayList<>();

        // sort the array (important for two pointer + duplicate handling)
        Arrays.sort(nums);

        // loop to fix one number (nums[i])
        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate values of i (to avoid same triplets)
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // two pointers
            int left = i + 1;              // next element
            int right = nums.length - 1;  // last element

            // find pairs using two pointer
            while (left < right) {

                // sum of three numbers
                int sum = nums[i] + nums[left] + nums[right];

                // case 1: found valid triplet
                if (sum == 0) {

                    // add triplet to result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicate values for left
                    while (left < right && nums[left] == nums[left + 1]) left++;

                    // skip duplicate values for right
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // move both pointers
                    left++;
                    right--;
                } 

                // case 2: sum is smaller → need bigger value
                else if (sum < 0) {
                    left++;   // move left forward
                } 

                // case 3: sum is bigger → need smaller value
                else {
                    right--;  // move right backward
                }
            }
        }

        // return all found triplets
        return result;
    }

    public static void main(String[] args) {
      int[] arr = {-1,0,1,2,-1,-4};
      LC_15 sol = new LC_15();

      // call threeSum function and store all triplets (jinka sum 0 hai) in result list
      List<List<Integer>> result = sol.threeSum(arr);

       System.out.print("[");
        // we use for each loop for printing the result
        for (List<Integer> triplet : result) {
            System.out.print(triplet);
      }
      System.out.print("]");
}
}


/*
In short = Fix 1 number + find 2 numbers using two pointer

Flow ;

First, we create a list called result to store all valid triplets.

Then, we sort the given array so that we can use the two-pointer technique easily 
and also handle duplicates properly.

Now, we run a loop from index 0 to n-3. This loop is used to fix one element at a time.

For every element, first check if it is a duplicate of the previous element. 
If yes, skip it to avoid repeating the same triplets.

Now, take two pointers:
left pointer just after the current element (i + 1)
right pointer at the end of the array (n - 1)

Run a loop while left < right. This means we will keep checking pairs until both pointers meet.

Inside the loop, calculate the sum of three elements:
nums[i] + nums[left] + nums[right]

If the sum is equal to 0:
add this triplet into the result list.

Then skip duplicate values for left pointer (to avoid repeating same triplet),
and also skip duplicate values for right pointer.

After that, move both pointers:
left++
right--

If the sum is less than 0:
move the left pointer forward because we need a bigger value.

If the sum is greater than 0:
move the right pointer backward because we need a smaller value.

Repeat this process until left and right cross each other.

Continue this for all elements in the loop.

At last, return the result list which contains all unique triplets whose sum is 0.
*/
